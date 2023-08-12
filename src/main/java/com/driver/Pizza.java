package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private StringBuilder bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.takeawayAdded = false;
        this.bill = new StringBuilder();
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            this.price += 80;
            this.bill.append("Extra Cheese Added: 80\n");
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            this.price += isVeg ? 70 : 120;
            this.bill.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        }
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            takeawayAdded = true;
            this.price += 20;
            this.bill.append("Paperbag Added: 20\n");
        }
    }

    public String getBill() {
        this.bill.insert(0, "Base Price Of The Pizza: " + this.price + "\n");
        this.bill.append("Total Price: ").append(this.price);
        return this.bill.toString();
    }
}
