package com.firsttask.zoo;

public class Dog
{
    private String name;
    private int age;
    private int height;
    private float weight;
    private boolean trained;

    public Dog() {
    }

    public Dog(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(final int height, final float weight, final boolean trained) {
        this.height = height;
        this.weight = weight;
        this.trained = trained;
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

    public boolean isTrained() {
        return this.trained;
    }

    public void setTrained(final boolean trained) {
        this.trained = trained;
    }

    public void say()
    {
        System.out.println("The dog says: HAM HAM.");
    }

    public void walk()
    {
        System.out.println("The dog is walking to you.");
    }

    public void run()
    {
        System.out.println("The dog is running after you...");
    }

    public void swim()
    {
        System.out.println("The dog is swimming!");
    }

    public void wagging()
    {
        System.out.println("The dog is wagging.");
    }


}
