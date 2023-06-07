package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversed = 0;
        while (number != 0) {
           int remainder = number % 10;
           reversed = (reversed * 10) + 10;
           number = number/10;
        }
        System.out.println(reversed);
    }

}
