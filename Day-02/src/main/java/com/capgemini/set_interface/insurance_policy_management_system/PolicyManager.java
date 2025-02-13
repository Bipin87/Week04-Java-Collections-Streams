package com.capgemini.set_interface.insurance_policy_management_system;

import java.util.*;

public class PolicyManager {
    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    // Adds a policy to all sets
    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // Display all unique policies
    public void displayAllPolicies() {
        System.out.println("All Unique Policies:");
        for (InsurancePolicy policy : hashSetPolicies) {
            System.out.println(policy);
        }
    }

    // Display policies expiring in the next 30 days
    public void displayExpiringSoon() {
        System.out.println("Policies Expiring Soon (Next 30 days):");
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        Date threshold = calendar.getTime();

        for (InsurancePolicy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(threshold)) {
                System.out.println(policy);
            }
        }
    }

    // Display policies of a specific coverage type
    public void displayByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    // Display duplicate policies based on policy number
    public void displayDuplicatePolicies() {
        System.out.println("Duplicate Policies (by Policy Number):");
        Set<String> seenNumbers = new HashSet<>();
        Set<InsurancePolicy> duplicates = new HashSet<>();

        for (InsurancePolicy policy : linkedHashSetPolicies) {
            if (!seenNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        for (InsurancePolicy policy : duplicates) {
            System.out.println(policy);
        }
    }
}
