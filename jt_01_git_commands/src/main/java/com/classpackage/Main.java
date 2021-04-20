package com.classpackage;

public class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        System.out.println();
        System.out.println("******   CHAPTER 1   ******");
        System.out.println("Hello");

        final Trainer trainer = new Trainer("Andreea", 24, "Trainer");

        System.out.println("List of trainers");
        System.out.println(trainer.toString());

        final Trainee trainee = new Trainee(trainer, "Alex");

        System.out.println(trainee.toString());


    }
}
