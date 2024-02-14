package Snack;

public class MyOrder extends StarbucksOrder {
    
    public MyOrder(String drinkname, int quantity){
        name = drinkname;
        amount = quantity;
    }
    
    public void printOrder(){
        String myOrder = DrinkName_and_Amount();

        System.out.println(myOrder);
    }

}
