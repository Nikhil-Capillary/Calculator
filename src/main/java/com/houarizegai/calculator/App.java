package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        int length = str.length(); // Potential NPE here
        System.out.println("Length of the string: " + length);
    }
}
