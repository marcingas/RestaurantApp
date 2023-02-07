public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("burger", "coke","fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType){
        this.burger = new Burger(burgerType, 6.0);
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }
    public double getTotalPrice() {
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        System.out.println("Your burger optimalization: ");
        burger.printItem();
        System.out.println("Rest of Your order :");
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("Total Price", getTotalPrice());
        System.out.println("-//-".repeat(7));
        System.out.printf("Thank You for Eating with us!%nYou are most Welcome any time!%nTake care for environment!");


    }
    public void addBurgerToppings (String extra){
        burger.addToppings(extra);
    }
    public void setDrinkSize(String size){
        drink.setSize(size);}
    public void setSideSize (String size){
            side.setSize(size);}

    }


