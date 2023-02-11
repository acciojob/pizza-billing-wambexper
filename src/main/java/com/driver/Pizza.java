package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            this.price = 300;
            this.toppings = 70;
        } else {
            this.price = 400;
            this.toppings = 120;
        }
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isBillCreated = false;
        this.isTakeAway = false;

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!isExtraCheeseAdded) {
            this.price += 80;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!isExtraToppingsAdded) {
            this.price += this.toppings;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!isTakeAway) {
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill() {

        if (!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }

            if (isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price +"\n";
            this.isBillCreated = true;


        }
        return this.bill;
    }

}

