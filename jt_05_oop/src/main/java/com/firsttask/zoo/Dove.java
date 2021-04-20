package com.firsttask.zoo;

public class Dove
{
    private String name;
    private int age;
    private int height;
    private float weight;
    private boolean postman;

    public Dove() {
    }

    public Dove(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Dove(final int height, final float weight, final boolean postman) {
        this.height = height;
        this.weight = weight;
        this.postman = postman;
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

    public boolean isPostman() {
        return this.postman;
    }

    public void setPostman(final boolean postman) {
        this.postman = postman;
    }

    public void say()
    {
        System.out.println("The dove said ' PEACE'.");
    }

    public void walk()
    {
        System.out.println("The dove is walking on the car.");
    }

    public void fly()
    {
        System.out.println("The dove flies to spread peace.");
    }

    public void sendMessage()
    {
        System.out.println("The dove has no message because you got a seen.");
    }



}
