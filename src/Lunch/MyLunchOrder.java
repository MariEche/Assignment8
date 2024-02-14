package Lunch;

public class MyLunchOrder extends AbstractLunchOrder {
    
    public MyLunchOrder(String foodname, String drinkname){
        food = foodname;
        drink = drinkname;
    }
    
    public void printLunchOrder(){
        String myLunchOrder = foodANDdrink();

        System.out.println(myLunchOrder);
    }

}
