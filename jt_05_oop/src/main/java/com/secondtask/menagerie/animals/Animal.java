package com.secondtask.menagerie.animals;

public class Animal {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Animal() {
    }

    public Animal(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(final int height, final int weight) {
        this.height = height;
        this.weight = weight;
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

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public void say() {
        System.out.println("The animal says 'hello'.");
    }


}
