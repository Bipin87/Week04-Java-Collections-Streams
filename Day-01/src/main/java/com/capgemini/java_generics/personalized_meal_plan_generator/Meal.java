package com.capgemini.java_generics.personalized_meal_plan_generator;

import java.util.ArrayList;
import java.util.List;

// definition of generic class Meal with bounded type parameters
public class Meal <T extends MealPlan> {
    List<T> meal;

    // Non-parameterized constructor
    public Meal() {
        meal = new ArrayList<>();
    }

    // Create a method to add the object in the list
    public void addMeal(T obj) {
        meal.add(obj);
    }

    // Method to display the state of all the objects in the list
    public void displayAllMeal() {
        for (MealPlan obj : meal) {
            obj.displayMealPlan();
            System.out.println();
        }
    }

    // Method that returns Meal list
    public List<T> getMealList() {
        return meal;
    }
}