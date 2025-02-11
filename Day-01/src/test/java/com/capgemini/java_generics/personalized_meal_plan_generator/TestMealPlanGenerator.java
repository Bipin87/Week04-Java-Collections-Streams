package com.capgemini.java_generics.personalized_meal_plan_generator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestMealPlanGenerator {
    @Test
    public void test() {
        // object of Meal class
        Meal<MealPlan> meal = new Meal<>();

        // Declaring the objects of various MealType classes
        MealPlan test1 = new VegetarianMeal("Vegetarian1", 280);
        MealPlan test2 = new VeganMeal("Vegan1", 270);
        MealPlan test3 = new KetoMeal("Keto1", 355);
        MealPlan test4 = new HighProteinMeal("HighProtein1", 432);

        // Adding these to the meal list
        meal.addMeal(test1);
        meal.addMeal(test2);
        meal.addMeal(test3);
        meal.addMeal(test4);

        // Getting the list of items from Meal
        List<MealPlan> expectedResult = meal.getMealList();

        // Performing tests
        assertEquals(test1, expectedResult.getFirst());
        assertEquals(test2, expectedResult.get(1));
        assertEquals(test3, expectedResult.get(2));
        assertEquals(test4, expectedResult.get(3));
    }

}