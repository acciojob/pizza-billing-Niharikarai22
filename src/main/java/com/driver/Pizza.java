package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private static int basePriceVeg=300;
    private static int basePriceNonVeg=400;
    private static int cheesePrice=80;
    private static int toppingsPriceVeg=70;
    private static int toppingsPriceNonVeg=120;
    private static int bagPrice=20;

    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isBagTaken;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (this.isVeg) {
            this.price+=basePriceVeg;
            bill="Base Price Of The Pizza: "+basePriceVeg+"\n";
        }
        else {
            this.price+=basePriceNonVeg;
            bill="Base Price Of The Pizza: "+basePriceNonVeg+"\n";
        }
        isCheeseAdded=isToppingsAdded=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded) return;
        isCheeseAdded=true;
        this.price+=cheesePrice;
    }

    public void addExtraToppings(){
        // your code goes here
        if (isToppingsAdded) return;
        if(this.isVeg) this.price+=toppingsPriceVeg;
        else this.price+=toppingsPriceNonVeg;
        isToppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        if (isBagTaken) return;
        isBagTaken=true;
        this.price+=bagPrice;
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated) return this.bill;
        isBillGenerated=true;
        if(isCheeseAdded) bill+="Extra Cheese Added: "+cheesePrice+"\n";
        if(isToppingsAdded) {
            if(this.isVeg) bill+="Extra Toppings Added: "+toppingsPriceVeg+"\n";
            else bill+="Extra Toppings Added: "+toppingsPriceNonVeg+"\n";
        }
        if(isBagTaken) bill+="Paperbag Added: "+bagPrice+"\n";
        bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
