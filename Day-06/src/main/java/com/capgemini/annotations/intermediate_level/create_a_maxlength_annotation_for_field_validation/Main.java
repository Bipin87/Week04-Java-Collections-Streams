package com.capgemini.annotations.intermediate_level.create_a_maxlength_annotation_for_field_validation;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a User with a valid username
            User user1 = new User("Bipin");
            System.out.println("User 1 username: " + user1.getUsername());

            // Create a User with an invalid username (length exceeds the limit)
            User user2 = new User("bipin@87");
            System.out.println("User 2 username: " + user2.getUsername());

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}