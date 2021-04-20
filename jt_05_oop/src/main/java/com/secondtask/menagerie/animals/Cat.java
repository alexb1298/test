package com.secondtask.menagerie.animals;

import com.secondtask.menagerie.interfaces.Running;
import com.secondtask.menagerie.interfaces.Walking;


public class Cat extends Animal implements Walking, Running {
    private boolean mouseCatcher;

    public Cat() {
        super();
    }

    public Cat(final String name, final int age) {
        super(name, age);
    }

    public Cat(final int height, final int weight, final boolean mouseCatcher) {
        super(height, weight);
        this.mouseCatcher = mouseCatcher;
    }

    public boolean isMouseCatcher() {
        return this.mouseCatcher;
    }

    public void setMouseCatcher(final boolean mouseCatcher) {
        this.mouseCatcher = mouseCatcher;
    }

    public void walk() {
        System.out.println("The cat is walking to you to get some attention.");
    }

    @Override
    public void run() {
        System.out.println("The cat is running to a dog.");
    }

    public void purr() {
        System.out.println("Pur");
    }


}
