package com.epam.OOP;

public class Bird extends Animal {

  public Bird() {
    super("blue", 2, false);
  }

  public String getDescription() {
    String itHasFur = super.hasFur == true ? "a" : "no";

    String noOfPaws = super.numberOfPaws > 1 ? "paws" : "paw";

    return (
      "This animal is mostly " +
      super.color +
      ". It has " +
      super.numberOfPaws +
      " " +
      noOfPaws +
      " and " +
      itHasFur +
      " fur. Moreover, it has 2 wings and can fly."
    );
  }
}
