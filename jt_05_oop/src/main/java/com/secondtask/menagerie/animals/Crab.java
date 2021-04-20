package com.secondtask.menagerie.animals;

import com.secondtask.menagerie.interfaces.Walking;
import com.secondtask.menagerie.interfaces.Swimming;

public class Crab extends Animal implements Walking, Swimming {
    private String shell;

    public Crab() {
        super();
    }

    public Crab(final String name, final int age) {
        super(name, age);
    }

    public Crab(final int height, final int weight, final String shell) {
        super(height, weight);
        this.shell = shell;
    }

    public String getShell() {
        return this.shell;
    }

    public void setShell(final String shell) {
        this.shell = shell;
    }

    public void walk() {
        System.out.println("The crab is walking.");
    }

    public void swim() {
        System.out.println("The crab is swimming.");
    }

    public void hide() {
        System.out.println("The crab is hiding.");
    }
}
