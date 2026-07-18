class FoodItem {
    int itemId;
    String itemName;
    double price;

    static String cafeteriaName = "UCampus Cafeteria";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;

    void addFoodItem(int id, String name, double price) {
        itemId = id;
        itemName = name;
        this.price = price;
        totalFoodItems++;
    }


    double calculateFinalPrice() {
        return price + (price * serviceCharge / 100);
    }

    void displayItemDetails() {
        System.out.println("Item ID      : " + itemId);
        System.out.println("Item Name    : " + itemName);
        System.out.println("Original Price : " + price);
        System.out.println("Final Price    : " + calculateFinalPrice());
        System.out.println();
    }
    
    static void changeServiceCharge(double newCharge) {
        serviceCharge = newCharge;
    }

  
    static void displayCafeteriaDetails() {
        System.out.println("Cafeteria Name : " + cafeteriaName);
        System.out.println("Service Charge : " + serviceCharge + "%");
        System.out.println("Total Food Items : " + totalFoodItems);
        System.out.println();
    }
}
