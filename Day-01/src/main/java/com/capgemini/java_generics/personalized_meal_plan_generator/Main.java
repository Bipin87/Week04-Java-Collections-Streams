package com.capgemini.java_generics.personalized_meal_plan_generator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Object of Meal class
        Meal<MealPlan> meal = new Meal<>();
        // Object of scanner class
        Scanner sc = new Scanner(System.in);

        // Creating meal plan for all meal types
        MealPlan vegetarian1 = new VegetarianMeal("Veg1", 290);
        MealPlan vegetarian2 = new VegetarianMeal("Veg2", 420);

        MealPlan vegan1 = new VeganMeal("Vegan1", 240);
        MealPlan vegan2 = new VeganMeal("Vegan2", 180);

        MealPlan keto1 = new KetoMeal("Keto1", 350);
        MealPlan keto2 = new KetoMeal("Keto2", 410);

        MealPlan highProtein1 = new HighProteinMeal("High Protein 1", 450);
        MealPlan highProtein2 = new HighProteinMeal("High Protein 2", 350);

        // Adding all meals to the meal list
        meal.addMeal(vegetarian1);
        meal.addMeal(vegan1);
        meal.addMeal(keto1);
        meal.addMeal(highProtein1);
        meal.addMeal(vegetarian2);
        meal.addMeal(vegan2);
        meal.addMeal(keto2);
        meal.addMeal(highProtein2);

        // Display details of all meals
        System.out.println("Displaying All Meals:  ");
        meal.displayAllMeal();
    }
}
