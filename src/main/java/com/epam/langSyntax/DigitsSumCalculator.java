package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        if (number == 0 || number < 0)
            System.out.println(0);;
        System.out.println(number % 10 + calculateSum(number / 10));
    }

}
