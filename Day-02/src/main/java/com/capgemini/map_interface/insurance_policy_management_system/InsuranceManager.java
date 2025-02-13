package com.capgemini.map_interface.insurance_policy_management_system;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsuranceManager {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>(); // Stores policies by policy number
    private Map<String, InsurancePolicy> orderedPolicies = new LinkedHashMap<>(); // Maintains insertion order
    private Map<LocalDate, InsurancePolicy> sortedPolicies = new TreeMap<>(); // Sorted by expiry date

    // Add a policy to all maps
    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicies.put(policy.getPolicyNumber(), policy);
        sortedPolicies.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by its number
    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring in the next 30 days
    public List<InsurancePolicy> getExpiringPolicies() {
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (Map.Entry<LocalDate, InsurancePolicy> entry : sortedPolicies.entrySet()) {
            if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<InsurancePolicy> getPoliciesByHolder(String holderName) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(holderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        sortedPolicies.entrySet().removeIf(entry -> entry.getKey().isBefore(today));
        policyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        orderedPolicies.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
    }
}
