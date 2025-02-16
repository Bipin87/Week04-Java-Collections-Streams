package com.capgemini.regex.advanced_problems.validate_an_ip_address;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateIPAddressTest {

    @Test
    void checkIp(){
        String ip = "255.195.245.196";
        assertTrue(ValidateIPAddress.validateIpAddress(ip));
    }
}