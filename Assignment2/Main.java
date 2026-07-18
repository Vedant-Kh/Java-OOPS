public class Ucampus{
    public static void main(String[] args) {

        FoodItem item1 = new FoodItem();
        FoodItem item2 = new FoodItem();
        FoodItem item3 = new FoodItem();

        item1.addFoodItem(101, "Veg Sandwich", 80);
        item2.addFoodItem(102, "Cold Coffee", 120);
        item3.addFoodItem(103, "Paneer Wrap", 150);

        FoodItem.displayCafeteriaDetails();

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();

        FoodItem.changeServiceCharge(15);

        System.out.println("After Updating Service Charge\n");

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
    }
}
