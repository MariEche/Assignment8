package Breakfast;

public class AllDay_Budget {
    private String Meal;
    private int DayBudget;

    public AllDay_Budget(){
        Meal = "No meal";
        DayBudget = 0;
    }

    public AllDay_Budget(String AssignMeal, int amount){
        Meal = AssignMeal;
        DayBudget = amount;
    }

    public void getBudget(){
        System.out.println("The budget for " + Meal + " is: $" + DayBudget);
    }

}
