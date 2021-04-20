package com.classpackage;

public class Trainee {
    private final Trainer trainer;
    private final String name;

    public Trainee(final Trainer trainer, final String name) {
        this.trainer = trainer;
        this.name = name;
    }

    @Override
    public String toString() {
        return "List of trainees \n"+"Trainee{" +
                "trainer=" + this.trainer +
                ", name='" + this.name + '\'' +
                '}'+"\n";
    }
}
