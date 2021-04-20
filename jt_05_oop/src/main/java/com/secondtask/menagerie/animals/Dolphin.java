package com.secondtask.menagerie.animals;

import com.secondtask.menagerie.interfaces.Swimming;
import com.exception.IncorrectInputException;

public class Dolphin extends Animal implements Swimming {
    private int intelligence;

    public Dolphin() {
        super();
    }

    public Dolphin(final String name, final int age) {
        super(name, age);
    }

    public Dolphin(final int height, final int weight, final int intelligence) throws IncorrectInputException {
        super(height, weight);
        if (intelligence >= 0 && intelligence <= 100)
            this.intelligence = intelligence;
        else
            throw new IncorrectInputException("Intelligence is not between 0-100");
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

    public void swim() {
        System.out.println("The dolphin is swimming.");
    }

    public void jump() {
        System.out.println("The dolphin is jumping.");
    }


}
