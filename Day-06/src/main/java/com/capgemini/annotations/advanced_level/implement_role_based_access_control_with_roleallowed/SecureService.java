package com.capgemini.annotations.advanced_level.implement_role_based_access_control_with_roleallowed;

class SecureService {
    
    @RoleAllowed("ADMIN")
    public void adminOnlyOperation() {

        System.out.println("Admin operation executed successfully.");
    }

}