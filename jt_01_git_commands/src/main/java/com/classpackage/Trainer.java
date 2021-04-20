package com.classpackage;

public class Trainer
{
    private final String name;
    private final int age;
    private final String role;

    public Trainer(final String name, final int trainerAge, final String role) {
        this.name = name;
        this.age = trainerAge;
        this.role = role;
    }


    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", role='" + this.role + '\'' +
                '}';
    }
}
