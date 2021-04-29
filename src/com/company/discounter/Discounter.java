package com.company.discounter;

public class Discounter {

    private IDiscountStrategy discountStrategy;

    public Discounter() {
    }

    public void setDiscountStrategy(IDiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice (double price){
        return discountStrategy.calculateDiscount(price);
    }
}
