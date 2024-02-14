package Snack;

public abstract class StarbucksOrder {
    protected String name;
    protected int amount;

    abstract void printOrder();

    public String DrinkName_and_Amount(){
        return "I'm ordering " + amount + name +"(s)";
    }

}
