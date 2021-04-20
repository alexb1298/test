package com.secondtask.menagerie.animals;
import com.secondtask.menagerie.interfaces.Flying;
import com.secondtask.menagerie.interfaces.Walking;

public class Dove extends Animal implements Walking, Flying
{
    private boolean postman;

    public Dove() {
        super();
    }

    public Dove(final String name, final int age) {
        super(name, age);
    }


    public Dove(final int height, final int weight, final boolean postman) {
        super(height, weight);
        this.postman = postman;
    }

    public boolean isPostman() {
        return this.postman;
    }

    public void setPostman(final boolean postman) {
        this.postman = postman;
    }

    public void sendMessage()
    {
        System.out.println("The dove has no message because you got a seen.");
    }

    public void walk()
    {
        System.out.println("The dove is walking on the car.");
    }

    public void fly()
    {
        System.out.println("The dove flies to spread peace.");
    }



}
