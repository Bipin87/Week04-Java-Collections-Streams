package com.capgemini.set_interface.insurance_policy_management_system;

import java.util.Date;
import java.util.Objects;

public class InsurancePolicy implements Comparable<InsurancePolicy>{
    // Attributes
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    // Parameterized constructor
    public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getter method to get the values
    public String getPolicyNumber() {
        return policyNumber; }
    public Date getExpiryDate() {
        return expiryDate; }
    public String getCoverageType() {
        return coverageType; }


    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof InsurancePolicy)) return false;
        InsurancePolicy other = (InsurancePolicy) obj;
        return this.policyNumber.equals(other.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate + ", Type: " + coverageType + ", Premium: " + premiumAmount;
    }
}
