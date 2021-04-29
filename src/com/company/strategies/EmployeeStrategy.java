package com.company.strategies;

import com.company.discounter.IDiscountStrategy;

public class EmployeeStrategy implements IDiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price*0.5;
    }
}
