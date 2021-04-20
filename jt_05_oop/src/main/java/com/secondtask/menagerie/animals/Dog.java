package com.secondtask.menagerie.animals;
import com.secondtask.menagerie.interfaces.Running;
import com.secondtask.menagerie.interfaces.Walking;
import com.secondtask.menagerie.interfaces.Swimming;


public class Dog extends Animal implements Walking, Swimming, Running
{
    private boolean trained;

    public Dog() {
        super();
    }

    public Dog(final String name, final int age) {
        super(name, age);

    }

    public Dog(final int height, final int weight, final boolean trained) {
        super(height, weight);
        this.trained = trained;
    }

    public boolean isTrained() {
        return this.trained;
    }

    public void setTrained(final boolean trained) {
        this.trained = trained;
    }

    public void walk()
    {
        System.out.println("The dog is walking to you.");
    }

    @Override
    public void run()
    {
        System.out.println("The dog is running after you...");
    }

    @Override
    public void swim()
    {
        System.out.println("The dog is swimming");
    }

    public void wagging()
    {
        System.out.println("The dog is wagging.");
    }
}
