package com.task;

public class Keyboard
{
    private final String keyboardType;
    private final String yearOfProduction;

    public Keyboard(final String keyboardType, final String yearOfProduction)
    {
        this.keyboardType = keyboardType;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString()
    {
        return "keyboardType='" + this.keyboardType + '\'' + ", yearOfProduction='" + this.yearOfProduction + "'";
    }
}
