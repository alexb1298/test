package com.firsttask.zoo;

public class Duck
{
    private String name;
    private int age;
    private int height;
    private float weight;
    private boolean wild;

    public Duck() {
    }

    public Duck(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Duck(final int height, final float weight, final boolean wild) {
        this.height = height;
        this.weight = weight;
        this.wild = wild;
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

    public boolean isWild() {
        return this.wild;
    }

    public void setWild(final boolean wild) {
        this.wild = wild;
    }

    public void say()
    {
        System.out.println("The duck says mac mac.");
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
