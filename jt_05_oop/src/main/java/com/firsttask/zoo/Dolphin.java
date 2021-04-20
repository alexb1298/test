package com.firsttask.zoo;

import com.exception.IncorrectInputException;

public class Dolphin {
    private String name;
    private int age;
    private int height;
    private float weight;
    private int intelligence;

    public Dolphin() {
    }

    public Dolphin(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Dolphin(final int height, final float weight, final int intelligence) throws IncorrectInputException {
        this.height = height;
        this.weight = weight;
        if (intelligence >= 0 && intelligence <= 100)
            this.intelligence = intelligence;
        else
            throw new IncorrectInputException("Intelligence is not between 0-100");
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(final float weight) {
        this.weight = weight;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(final int intelligence) throws IncorrectInputException {
        if (intelligence >= 0 && intelligence <= 100)
            this.intelligence = intelligence;
        else
            throw new IncorrectInputException("Intelligence is not between 0-100");
    }

    public void say() {
        System.out.println("The dolphin says hello.");
    }

    public void swim() {
        System.out.println("The dolphin is swimming.");
    }

    public void jump() {
        System.out.println("The dolphin is jumping.");
    }


}
