package com.capgemini.annotations.advanced_level.implement_role_based_access_control_with_roleallowed;


import static com.capgemini.annotations.advanced_level.implement_role_based_access_control_with_roleallowed.AccessControl.executeMethodIfAuthorized;

public class Main {
    public static void main(String[] args) throws Exception {
        SecureService service = new SecureService();
        executeMethodIfAuthorized(service, "adminOnlyOperation");

    }

}
