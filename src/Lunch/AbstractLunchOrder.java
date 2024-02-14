package Lunch;

public abstract class AbstractLunchOrder {
    protected String food;
    protected String drink;
    
    abstract void printLunchOrder();
    
    public String foodANDdrink(){
    return "I'm ordering a " + food + " combo with a " + drink;
        }
    
    }


