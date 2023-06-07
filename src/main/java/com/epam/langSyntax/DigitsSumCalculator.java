package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        if (number == 0 || number < 0)
            return 0;
        return number % 10 + calculateSum(number / 10);
    }

}
