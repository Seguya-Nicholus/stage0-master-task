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

    public String getDescription(){
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paws and ('a'/'no' -> depends on value of hasFur) fur.";
    }

}
