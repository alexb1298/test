package com.firsttask;

import com.firsttask.zoo.Dog;
import com.firsttask.zoo.Dolphin;
import com.firsttask.zoo.Dove;
import com.exception.IncorrectInputException;

public class Zoo {
    private Zoo() {
    }

    public static void main(final String[] args) {
        System.out.println("**********  Chapter 5  **********");
        System.out.println();
        System.out.println("We created for you 3 animals: dog,dove and a dolphin.");
        final Dog dog = createDog();

        final Dove dove = createDove();

        final Dolphin dolphin = createDolphin();
        try {
            final int intelligence = 101;
            dolphin.setIntelligence(intelligence);

        } catch (final IncorrectInputException exception) {
            System.out.println(exception.getMessage());
        }
        printLocalAnimals(dog, dove, dolphin);

        runAnimalsMethods(dog, dove, dolphin);

    }

    private static Dolphin createDolphin() {
        final Dolphin dolphin = new Dolphin();
        dolphin.setName("Mircea");
        dolphin.setAge(7);
        final int height = 200;
        dolphin.setHeight(height);
        final int weight = 65;
        dolphin.setWeight(weight);
        return dolphin;
    }

    private static Dove createDove() {
        final Dove dove = new Dove(7, 3.2f, true);
        dove.setName("Peace");
        dove.setAge(2);
        return dove;
    }

    private static Dog createDog() {
        final Dog dog = new Dog("Alfie", 5);
        final int height = 35;
        dog.setHeight(height);
        final int weight = 25;
        dog.setWeight(weight);
        dog.setTrained(true);
        return dog;
    }

    private static void runAnimalsMethods(final Dog animalDog, final Dove dove, final Dolphin dolphin) {
        System.out.println();
        System.out.println("Let's see what our animal can do:");
        dogMethods(animalDog);
        System.out.println();
        doveMethods(dove);
        System.out.println();
        dolphinMethods(dolphin);
    }

    private static void printLocalAnimals(final Dog animalDog, final Dove dove, final Dolphin dolphin) {
        final String name="name='";
        final String age=", age=";
        final String height=", height=";
        final String weight=", weight= ";
        final String trained=", trained=";
        System.out.println();
        System.out.println("Printing the details for our animals:");
        System.out.println("Dog --->" + name + animalDog.getName() + "'" +
                age + animalDog.getAge() +
                height + animalDog.getHeight() +
                weight + animalDog.getWeight() +
                trained + animalDog.isTrained());

        System.out.println("Dove--->" + name + dove.getName() + '\'' +
                age + dove.getAge() +
                height + dove.getHeight() +
                weight + dove.getWeight() +
                ", postman=" + dove.isPostman());

        System.out.println("Dolphin--->" + "name='" + dolphin.getName() + '\'' +
                age + dolphin.getAge() +
                height + dolphin.getHeight() +
                weight + dolphin.getWeight() +
                ", intelligence=" + dolphin.getIntelligence());
    }

    private static void dogMethods(final Dog animalDog) {
        System.out.println();
        System.out.println("The dog can do the following:");
        animalDog.say();
        animalDog.walk();
        animalDog.swim();
        animalDog.run();
        animalDog.wagging();
    }

    private static void doveMethods(final Dove dove) {
        System.out.println();
        System.out.println("The dove can't do the following:");
        dove.say();
        dove.walk();
        dove.fly();
        dove.sendMessage();
    }

    private static void dolphinMethods(final Dolphin dolphin) {
        System.out.println();
        System.out.println("The dolphin can do the following:");
        dolphin.say();
        dolphin.swim();
        dolphin.jump();
    }


}
