package Dinner;

public class DinnerOrder implements DinnerCourses{

    @Override
    public void salad() {
        final String mysalad = ("I dont like salads so I won't order one");
        System.out.println(mysalad);
    }

    @Override
    public void appetizer() {
        final String myapetizer = ("I only order appetizer when I can share with someone else");
        System.out.println(myapetizer);
    }

    @Override
    public void entree() {
        final String myentree = ("I really hope they have pastas as entree options");
        System.out.println(myentree);
    }

    @Override
    public void dessert() {
        final String mydessert = ("If they have lava cake, I'll order it for dessert");
        System.out.println(mydessert);
    }



}
