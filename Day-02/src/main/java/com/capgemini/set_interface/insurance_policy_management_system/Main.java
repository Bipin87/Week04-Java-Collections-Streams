package com.capgemini.set_interface.insurance_policy_management_system;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PolicyManager system = new PolicyManager();

        // Adding policies in insurance
        system.addPolicy(new InsurancePolicy("P111", "Abhinav", new Date(System.currentTimeMillis() + 12000000L * 10), "Health", 499.99));
        system.addPolicy(new InsurancePolicy("P112", "BK Sahu", new Date(System.currentTimeMillis() + 24000000L * 40), "Auto", 60.0));
        system.addPolicy(new InsurancePolicy("P113", "Deepraj", new Date(System.currentTimeMillis() + 86400000L * 20), "Home", 900.0));
        system.addPolicy(new InsurancePolicy("P123", "Aryan", new Date(System.currentTimeMillis() + 57000000L * 10), "Health", 500.0));

        // Display results
        system.displayAllPolicies();
        System.out.println();
        system.displayExpiringSoon();
        System.out.println();
        system.displayByCoverageType("Health");
        System.out.println();
        system.displayDuplicatePolicies();
    }
}
