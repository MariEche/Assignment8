package Breakfast;

public class MyBreakfast implements BreakfastOptions{

    @Override
    public void drink() {
        final String mydrink = ("I like to get a hot chocolate");
        System.out.println(mydrink);
    }

    @Override
    public void fruit() {
        final String myfruit = ("I like to get papaya or apples");
        System.out.println(myfruit);
    }

    @Override
    public void sweet() {
        final String sweet_meal = ("I like to get crepes or pancakes");
        System.out.println(sweet_meal);
    }

    @Override
    public void savory() {
        final String savory_meal = ("I like to get scrambled eggs or a sandwich");
        System.out.println(savory_meal);
    }

}
