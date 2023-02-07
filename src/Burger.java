public class Burger extends Item {

    private Item extra;

    public Burger(String name, double price) {
        super("BURGER", name, price);
    }

    @Override
    public String getName() {
        return super.getName()+ " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra == null) ? 0 : extra.getAdjustedPrice());
    }
    public double getExtraPrice (String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO","CHEESE","ONION" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.50;
            default -> 0.55;
        };
    }
    public void addToppings (String extra){
        this.extra = new Item("TOPPINGS",extra,getExtraPrice(extra));
    }
    public void printItemizedList(){
        printItem("BASE BURGER", getBasePrice());
        if(extra != null){
            extra.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
