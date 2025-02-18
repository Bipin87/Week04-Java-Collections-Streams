package com.capgemini.annotations.advanced_level.implement_role_based_access_control_with_roleallowed;

class UserContext {
    private static String currentUserRole;
    
    public static void setCurrentUserRole(String role) {
        currentUserRole = role;
    }
    
    public static String getCurrentUserRole() {
        return currentUserRole;
    }
}