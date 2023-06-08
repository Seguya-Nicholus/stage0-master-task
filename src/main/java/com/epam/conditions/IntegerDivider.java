package com.epam.conditions;

public class IntegerDivider {

  public void printCompletelyDivided(int dividend, int divider) {
    double result = dividend / divider;

    int product = Integer.valueOf((int) (result * divider));
    if (divider == 0) {
      throw new ArithmeticException("division by zero");
    } else if (product == dividend) {
      System.out.println("can be divided completely");
    } else {
      System.out.println("cannot be divided completely");
    }
  }
}
