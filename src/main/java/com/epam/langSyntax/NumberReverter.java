package com.epam.langSyntax;

public class NumberReverter {

  public void revert(int number) {
    int reversed = 0;
    int remainder;
    while (number != 0) {
      remainder = number % 10;
      reversed = (reversed * 10) + remainder;
      number = number / 10;
    }
    System.out.println(reversed);
  }
}
