package com.hamburger;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }


    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger() +
                this.healthyExtra1Price + this.healthyExtra2Price;

        System.out.println("Healthy Extra 1: " + this.healthyExtra1Name +
                " : $" + this.healthyExtra1Price +
                "\nHealthy Extra 2: " + this.healthyExtra2Name +
                " : $" + this.healthyExtra2Price +
                "\nTotal Price: $" + totalPrice);

        return totalPrice;
    }
}
