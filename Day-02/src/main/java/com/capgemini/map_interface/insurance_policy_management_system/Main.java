package com.capgemini.map_interface.insurance_policy_management_system;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsuranceManager manager = new InsuranceManager();

        // Add sample policies
        manager.addPolicy(new InsurancePolicy("P123", "Aman", LocalDate.now().plusDays(10), "Health", 500.0));
        manager.addPolicy(new InsurancePolicy("P124", "BK Sahu", LocalDate.now().plusDays(40), "Auto", 300.0));
        manager.addPolicy(new InsurancePolicy("P125", "Aman", LocalDate.now().plusDays(20), "Home", 700.0));

        // Retrieve and display policies
        System.out.println("Policy P123: " + manager.getPolicyByNumber("P123"));
        System.out.println("Expiring Policies: " + manager.getExpiringPolicies());
        System.out.println("Aman Policies: " + manager.getPoliciesByHolder("Aman"));

        // Remove expired policies
        manager.removeExpiredPolicies();
        System.out.println("Policies after removing expired ones: " + manager.getExpiringPolicies());
    }
}
