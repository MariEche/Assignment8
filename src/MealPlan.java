import Breakfast.*;
import Dinner.*;
import Lunch.*;
import Snack.*;



public class MealPlan {
    public static void main(String[] args) throws Exception {
        BreakFast_place Breakfast_plan = new BreakFast_place();
        Lunch_place Lunch_plan = new Lunch_place();
        Dinner_place Dinner_plan = new Dinner_place();
        Snack_place Snack_plan = new Snack_place();

        Breakfast_plan.setName("McDonalds");
        Breakfast_plan.personalRating(3);

        Lunch_plan.setName("Wendys");
        Lunch_plan.personalRating(5);

        Dinner_plan.setName("Dominos");
        Dinner_plan.personalRating(8);

        Snack_plan.setName("Starbucks");
        Snack_plan.personalRating(7);

        System.out.println("The restaurants I will go to today: ");
        B_placePrint.print();
        L_placePrint.print();
        D_placePrint.print();
        S_placePrint.print();

        AllDay_Budget Breakfast = new AllDay_Budget("Breakfast", 30);
        AllDay_Budget Lunch = new AllDay_Budget("Lunch", 20);
        AllDay_Budget Dinner = new AllDay_Budget("Dinner", 50);
        AllDay_Budget Snack = new AllDay_Budget("Snack", 10);

        Breakfast.getBudget();
        MyBreakfast MyBreakfast = new MyBreakfast();
        MyBreakfast.drink();
        MyBreakfast.fruit();
        MyBreakfast.sweet();
        MyBreakfast.savory();

        Lunch.getBudget();
        MyLunchOrder LunchMeal = new MyLunchOrder("chicken nuggets", "coke");
        LunchMeal.printLunchOrder();

        Dinner.getBudget();
        DinnerOrder MyDinner = new DinnerOrder();
        MyDinner.salad();
        MyDinner.appetizer();
        MyDinner.entree();
        MyDinner.dessert();
        
        Snack.getBudget(); 
        MyOrder DrinkSnack = new MyOrder(" Iced Mocha", 2 );
        DrinkSnack.printOrder();





        

        

        

    }
}
