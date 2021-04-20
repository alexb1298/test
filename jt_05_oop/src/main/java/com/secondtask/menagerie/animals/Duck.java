package com.secondtask.menagerie.animals;
import com.secondtask.menagerie.interfaces.Flying;
import com.secondtask.menagerie.interfaces.Swimming;
import com.secondtask.menagerie.interfaces.Walking;

public class Duck extends Animal implements Walking, Swimming, Flying
{
    private boolean wild;

    public Duck() {
        super();
    }

    public Duck(final String name, final int age) {
        super(name, age);
    }

    public Duck(final int height, final int weight, final boolean wild) {
        super(height, weight);
        this.wild = wild;
    }

    public boolean isWild() {
        return this.wild;
    }

    public void setWild(final boolean wild) {
        this.wild = wild;
    }

    public void walk()
    {
        System.out.println("The duck is walking to water.");
    }

    public void swim()
    {
        System.out.println("The duck swims to other river.");
    }

    public void fly()
    {
        System.out.println("The duck is flying.");
    }

    public void migrate()
    {
        System.out.println("The Duck starts to migrate.");
    }
}
