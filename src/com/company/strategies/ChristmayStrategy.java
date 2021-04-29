package com.company.strategies;

import com.company.discounter.IDiscountStrategy;

public class ChristmayStrategy implements IDiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price*0.8;
    }
}
