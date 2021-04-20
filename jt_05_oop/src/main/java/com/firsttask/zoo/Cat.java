package com.firsttask.zoo;

public class Cat
{
    private String name;
    private int catAge;
    private int height;
    private float weight;
    private boolean mouseCatcher;

    public Cat()
    {

    }

    public Cat(final String name, final int catAge)
    {
        this.name = name;
        this.catAge = catAge;
    }

    public Cat(final int height, final float weight, final boolean mouseCatcher)
    {
        this.height = height;
        this.weight = weight;
        this.mouseCatcher = mouseCatcher;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getCatAge() {
        return this.catAge;
    }

    public void setCatAge(final int catAge) {
        this.catAge = catAge;
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

    public boolean isMouseCatcher() {
        return this.mouseCatcher;
    }

    public void setMouseCatcher(final boolean mouseCatcher) {
        this.mouseCatcher = mouseCatcher;
    }

    public void say()
    {
        System.out.println("Cat says something.");
    }

    public void walk()
    {
        System.out.println("The cat is walking to you to get some attention.");
    }

    public void run()
    {
        System.out.println("The cat is running to a dog.");
    }

    public void purr()
    {
        System.out.println("Purr");
    }





}
