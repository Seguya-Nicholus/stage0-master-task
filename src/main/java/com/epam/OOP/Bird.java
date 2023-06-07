package com.epam.OOP;

public class Bird extends Animal {

    public Bird(){
        super("blue",2,false);
    }

    @Override
    public String getDescription(){
        return " This animal is mostly " + super.color +". It has " + super.numberOfPaws + " paws and no fur. Moreover, it has 2 wings and can fly.";
    }

}
