import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What path of order you choose?(BASIC,CUSTOM) ");
        Scanner scanner7 = new Scanner(System.in);
        String order = scanner7.nextLine();

        if(order.equals("BASIC") ){
            orderRequest("Hamburger","Cola","Fries","CHEESE", "MEDIUM", "MEDIUM");

    } else
    {
        System.out.println("What sort of Burger do You want? ");
        Scanner scanner = new Scanner(System.in);
        String burgerType = scanner.nextLine();
        System.out.println("What sort of drink do You want?(fe. Cola, 7-UP, TEA, COFFE, SHAKE) ");
        Scanner scanner1 = new Scanner(System.in);
        String drinkType = scanner1.nextLine();
        System.out.println("What sort of Side Type do You want?(fe. Fries, Hot potato,Hot tomato, French fries) ");
        Scanner scanner3 = new Scanner(System.in);
        String sideType = scanner3.nextLine();
        System.out.println("What sort of 1 Extra Topping do You want?(fe. AVOCADO, CHEESE, ONION, BACON, SALAMI) ");
        Scanner scanner4 = new Scanner(System.in);
        String extraTopping = scanner4.nextLine();
        System.out.println("What size of drink do You want?(SMALL, MEDIUM, LARGE) ");
        Scanner scanner5 = new Scanner(System.in);
        String drinkSize = scanner5.nextLine();
        System.out.println("What size of SIDE do You want?(SMALL, MEDIUM, LARGE) ");
        Scanner scanner6 = new Scanner(System.in);
        String sideSize = scanner6.nextLine();


        orderRequest(burgerType,drinkType,sideType,extraTopping, drinkSize, sideSize);}



    }
    public static void orderRequest(String burgerType, String drinkType, String sideType, String extraTopping, String drinkSize, String sideSize ){

        MealOrder firstMeal = new MealOrder(burgerType,drinkType,sideType);
        firstMeal.addBurgerToppings(extraTopping);
        firstMeal.setDrinkSize(drinkSize);
        firstMeal.setSideSize(sideSize);
        firstMeal.printItemizedList();

    }
}