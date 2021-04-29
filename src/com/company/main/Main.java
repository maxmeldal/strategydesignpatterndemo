package com.company.main;

import com.company.discounter.Discounter;
import com.company.strategies.EmployeeStrategy;

public class Main {

    public static void main(String[] args) {

        Discounter discounter = new Discounter();
        discounter.setDiscountStrategy(new EmployeeStrategy());

        System.out.println("price with discount is: " + discounter.calculatePrice(100));

    }
}
