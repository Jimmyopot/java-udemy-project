package nestedClasses.billsBurger;

public class Store {
    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("Ketchup", "Mayo", "Bacon");
        System.out.println(regularMeal);

        Meal UsRegularMeal = new Meal(0.68);
        System.out.println(UsRegularMeal);
    }
}
