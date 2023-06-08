package com.epam.OOP;

public class Animal {

  private String color;
  private int numberOfPaws;
  private boolean hasFur;

  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  public String getColor() {
    return this.color;
  }

  public int getNumberOfPaws() {
    return this.numberOfPaws;
  }

  public boolean getHasFur() {
    return this.hasFur;
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
