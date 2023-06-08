package com.epam.OOP;

public class Bird extends Animal {

  public Bird() {
    super("blue", 2, false);
  }

  public String getDescription() {
    String itHasFur = super.getHasFur() == true ? "a" : "no";

    String noOfPaws = super.getNumberOfPaws() > 1 ? "paws" : "paw";

    return (
      "This animal is mostly " +
      super.getColor() +
      ". It has " +
      super.getNumberOfPaws() +
      " " +
      noOfPaws +
      " and " +
      itHasFur +
      " fur. Moreover, it has 2 wings and can fly."
    );
  }
}
