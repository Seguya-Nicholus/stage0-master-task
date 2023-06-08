package com.epam.OOP;

public class Animal {

  protected String color;
  protected int numberOfPaws;
  protected boolean hasFur;

  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  public String getDescription() {
    String itHasFur = this.hasFur == true ? "a" : "no";

    String noOfPaws = this.numberOfPaws > 1 ? "paws" : "paw";

    return (
      "This animal is mostly " +
      this.color +
      ". It has " +
      this.numberOfPaws +
      " " +
      noOfPaws +
      " and " +
      itHasFur +
      " fur."
    );
  }
}
