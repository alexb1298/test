package com.firsttask.zoo;

public class Crab
{
    private String name;
    private int crabAge;
    private int height;
    private float weight;
    private String shell;

    public Crab() {
    }

    public Crab(final String name, final int crabAge) {
        this.name = name;
        this.crabAge = crabAge;
    }

    public Crab(final int height, final float weight, final String shell) {
        this.height = height;
        this.weight = weight;
        this.shell = shell;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getCrabAge() {
        return this.crabAge;
    }

    public void setCrabAge(final int crabAge) {
        this.crabAge = crabAge;
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

    public String getShell() {
        return this.shell;
    }

    public void setShell(final String shell) {
        this.shell = shell;
    }

    public void say()
    {
        System.out.println("The crab says 'don't cook me' ");
    }

    public void walk()
    {
        System.out.println("The crab is walking");
    }

    public void swim()
    {
        System.out.println("The crab is swimming");
    }
    public void hide()
    {
        System.out.println("The crab is hiding");
    }










}
