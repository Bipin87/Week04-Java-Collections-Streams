package com.capgemini.annotations.advanced_level.implement_role_based_access_control_with_roleallowed;

import java.lang.reflect.Method;

public class AccessControl {
    public static boolean executeMethodIfAuthorized(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();
            String currentRole = UserContext.getCurrentUserRole();

            System.out.println("Required Role: " + requiredRole);
            System.out.println("Current Role: " + currentRole);

            if (requiredRole.equals(currentRole)) {
                method.invoke(obj);
                return true;
            } else {
                System.out.println("Access Denied!");
                return false;
            }
        } else {
            method.invoke(obj);
            return true;
        }
    }

}
