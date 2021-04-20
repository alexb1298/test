package com.secondtask;

import com.secondtask.menagerie.animals.*;
import com.secondtask.menagerie.interfaces.Walking;
import com.exception.IncorrectInputException;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menagerie {
    private static final String NAME_STRING = "name='";
    private static final String AGE_STRING = ", age=";
    private static final String HEIGHT = ", height=";
    private static final String WEIGHT = ", weight= ";

    private Menagerie() {
    }

    public static void main(final String[] args) {
        System.out.println("**********  Chapter 5  **********");
        System.out.println();
        System.out.println("We created for you 3 animals: dog,dove and a dolphin.");
        //TASK 2.3
        printDogs(createDogs());
        printDoves(createDoves());
        printDolphins(createDolphins());
        printDucks(createDucks());
        printCrabs(createCrabs());
        printCats(createCats());
        runAnimalsMethods();
        //TASK 2.6
        final Iterable<Animal> animals = createAnimalList();
        //TASK 2.7
        runAnimalMethods(animals);
        //TASK 2.8
        final Iterable<Walking> walkingAnimals = createWalkingAnimals();

        //TASK 2.9
        runMethodWalkForWalkingAnimals(walkingAnimals);

    }

    private static void runMethodWalkForWalkingAnimals(final Iterable<Walking> walkingAnimals) {
        System.out.println();
        System.out.println("The animals walk like this:");
        for (final Walking walking : walkingAnimals) {
            walking.walk();
        }
    }

    private static Iterable<Walking> createWalkingAnimals() {
        return new ArrayList<>(Arrays.asList(new Dog(), new Cat("Banjo", 3),
                 new Duck("Duffy Duck", 2), new Dove(), new Crab()));
    }

    private static void runAnimalMethods(final Iterable<Animal> animals) {
        for (final Animal animal : animals) {
            if (animal instanceof Dog)
                runDogMethods((Dog) animal);
            else if (animal instanceof Dolphin)
                runDolphinMethods((Dolphin) animal);
            else if (animal instanceof Cat)
                runCatMethods((Cat) animal);
            else if (animal instanceof Crab)
                runCrabMethods((Crab) animal);
            else if (animal instanceof Duck)
                runDuckMethods((Duck) animal);
            else
                runDoveMethods((Dove) animal);
        }
    }

    private static Iterable<Animal> createAnimalList() {
        return new ArrayList<>(Arrays.asList(new Dog("Barney",1),
                new Dove("Gina",6),new Dolphin("Barkley",9)));
    }

    private static void runAnimalsMethods() {
        //TASK 2.5
        System.out.println("Let's see what our animal can do:");
        for (final Dog dog : createDogs())
            runDogMethods(dog);

        for (final Dolphin dolphin : createDolphins())
            runDolphinMethods(dolphin);

        for (final Dove dove : createDoves())
            runDoveMethods(dove);

        for (final Duck duck : createDucks())
            runDuckMethods(duck);

        for (final Cat cat : createCats())
            runCatMethods(cat);

        for (final Crab crab : createCrabs())
            runCrabMethods(crab);
    }

    private static void printCats(final Iterable<Cat> cats) {
        System.out.println();
        for (final Cat cat : cats) {
            System.out.println("Cat--->" + NAME_STRING + cat.getName() + '\'' +
                    AGE_STRING + cat.getAge() +
                    HEIGHT + cat.getHeight() +
                    WEIGHT + cat.getWeight() +
                    ", shell=" + cat.isMouseCatcher());
        }
    }

    private static void printCrabs(final Iterable<Crab> crabs) {
        System.out.println();
        for (final Crab crab : crabs) {
            System.out.println("Crab--->" + NAME_STRING + crab.getName() + '\'' +
                    AGE_STRING + crab.getAge() +
                    HEIGHT + crab.getHeight() +
                    WEIGHT + crab.getWeight() +
                    ", shell=" + crab.getShell());
        }
    }

    private static void printDucks(final Iterable<Duck> ducks) {
        System.out.println();
        for (final Duck duck : ducks) {
            System.out.println("Duck--->" + NAME_STRING + duck.getName() + '\'' +
                    AGE_STRING + duck.getAge() +
                    HEIGHT + duck.getHeight() +
                    WEIGHT + duck.getWeight() +
                    ", wild=" + duck.isWild());
        }
    }

    private static void printDolphins(final Iterable<Dolphin> dolphins) {
        System.out.println();
        for (final Dolphin dolphin : dolphins) {
            System.out.println("Dolphin--->" + NAME_STRING + dolphin.getName() + '\'' +
                    AGE_STRING + dolphin.getAge() +
                    HEIGHT + dolphin.getHeight() +
                    WEIGHT + dolphin.getWeight() +
                    ", intelligence=" + dolphin.getIntelligence());
        }
    }

    private static void printDoves(final Iterable<Dove> doves) {
        System.out.println();
        for (final Dove dove : doves) {
            System.out.println("Dove--->" + NAME_STRING + dove.getName() + '\'' +
                    AGE_STRING + dove.getAge() +
                    HEIGHT + dove.getHeight() +
                    WEIGHT + dove.getWeight() +
                    ", postman=" + dove.isPostman());
        }
    }

    private static void printDogs(final Iterable<Dog> dogs) {
        System.out.println();
        System.out.println("Printing the details for our animals:");
        for (final Dog dog : dogs) {
            System.out.println("Dog --->" + NAME_STRING + dog.getName() + "'" +
                    AGE_STRING + dog.getAge() +
                    HEIGHT + dog.getHeight() +
                    WEIGHT + dog.getWeight() +
                    ", trained=" + dog.isTrained());
        }
    }

    private static void runCrabMethods(final Crab crab) {
        System.out.println();
        System.out.println("The crab can do the following:");
        crab.say();
        crab.walk();
        crab.swim();
        crab.hide();
    }

    private static void runDuckMethods(final Duck duck) {
        System.out.println();
        System.out.println("The duck can do the following:");
        duck.say();
        duck.walk();
        duck.swim();
        duck.fly();
        duck.migrate();
    }

    private static void runCatMethods(final Cat animalCat) {
        System.out.println();
        System.out.println("The cat can do the following:");
        animalCat.say();
        animalCat.walk();
        animalCat.run();
        animalCat.purr();
    }

    private static void runDogMethods(final Dog animalDog) {
        System.out.println();
        System.out.println("The dog can do the following:");
        animalDog.say();
        animalDog.walk();
        animalDog.swim();
        animalDog.run();
        animalDog.wagging();
    }

    private static void runDoveMethods(final Dove dove) {
        System.out.println();
        System.out.println("The dove can't do the following:");
        dove.say();
        dove.walk();
        dove.fly();
        dove.sendMessage();
    }

    private static void runDolphinMethods(final Dolphin dolphin) {
        System.out.println();
        System.out.println("The dolphin can do the following:");
        dolphin.say();
        dolphin.swim();
        dolphin.jump();
    }

    private static List<Dog> createDogs() {
        final Dog dog = new Dog("Benji", 5);
        final int height = 35;
        dog.setHeight(height);
        final int weight = 25;
        dog.setWeight(weight);

        dog.setTrained(true);

        final Dog dog2 = new Dog(25, 25, true);
        dog2.setName("Ben");
        final int age = 12;
        dog2.setAge(age);

        final Dog dog3 = new Dog();
        dog3.setName("Colt Alb");
        final int age1 = 25;
        dog3.setAge(age1);
        final int height1 = 65;
        dog3.setHeight(height1);
        final int weight1 = 45;
        dog3.setWeight(weight1);
        dog3.setTrained(false);

        return Arrays.asList(dog, dog2, dog3);

    }

    private static List<Cat> createCats() {
        final Cat cat = new Cat("Matilda", 3);
        final int height = 15;
        cat.setHeight(height);
        cat.setWeight(10);
        cat.setMouseCatcher(false);

        final Cat cat2 = new Cat(20, 25, true);
        cat2.setName("Tom");
        final int age = 50;
        cat2.setAge(age);

        final Cat cat3 = new Cat();
        cat3.setName("Bessie");
        final int age1 = 51;
        cat3.setAge(age1);
        final int height1 = 180;
        cat3.setHeight(height1);
        final int weight = 50;
        cat3.setWeight(weight);
        cat3.setMouseCatcher(false);

        return Arrays.asList(cat, cat2, cat3);
    }

    private static List<Dove> createDoves() {
        final Dove dove = new Dove("Peace boy", 3);
        dove.setHeight(7);
        dove.setWeight(4);
        dove.setPostman(false);

        final Dove dove2 = new Dove(7, 3, true);
        dove2.setName("Barkley");
        dove2.setAge(2);

        final Dove dove3 = new Dove();
        dove3.setName("Bella");
        dove3.setAge(2);
        dove3.setHeight(7);
        dove3.setWeight(4);
        dove3.setPostman(true);

        return Arrays.asList(dove, dove2, dove3);
    }

    private static List<Duck> createDucks() {
        final Duck duck = new Duck("Ace", 2);
        duck.setHeight(5);
        duck.setWeight(3);
        duck.setWild(false);

        final Duck duck2 = new Duck(7, 5, true);
        duck2.setName("Aries");
        duck2.setAge(10);

        final Duck duck3 = new Duck();
        duck3.setName("Ally");
        final int age = 12;
        duck3.setAge(age);
        final int height = 35;
        duck3.setHeight(height);
        final int weight = 20;
        duck3.setWeight(weight);
        duck3.setWild(true);

        return Arrays.asList(duck, duck2, duck3);
    }

    private static List<Dolphin> createDolphins() {
        final Dolphin dolphin = createFirstDolphin();

        final Dolphin dolphin2 = createSecondDolphin();
        final Dolphin dolphin3 = createThirdDolphin();

        return Arrays.asList(dolphin, dolphin2, dolphin3);
    }

    private static Dolphin createFirstDolphin() {
        final Dolphin dolphin = new Dolphin("Argus", 10);
        final int height = 156;
        dolphin.setHeight(height);
        final int weight = 60;
        dolphin.setWeight(weight);
        try {
            final int intelligence = 99;
            dolphin.setIntelligence(intelligence);
        } catch (final IncorrectInputException exception) {
            System.out.println(exception.getMessage());
        }
        return dolphin;
    }

    private static Dolphin createThirdDolphin() {
        final Dolphin dolphin3 = new Dolphin();
        dolphin3.setName("Apollo");
        dolphin3.setAge(7);
        final int height1 = 200;
        dolphin3.setHeight(height1);
        final int weight1 = 65;
        dolphin3.setWeight(weight1);
        try {
            final int intelligence = 522;
            dolphin3.setIntelligence(intelligence);
        } catch (final IncorrectInputException exception) {
            System.out.println(exception.getMessage());
        }
        return dolphin3;
    }

    private static Dolphin createSecondDolphin() {
        Dolphin dolphin2;
        try {
            final int height1 = 187;
            final int weight1 = 68;
            final int intelligence = 88;
            dolphin2 = new Dolphin(height1, weight1, intelligence);
        } catch (final IncorrectInputException exception) {
            dolphin2 = new Dolphin();
            System.out.println(exception.getMessage());
        }
        dolphin2.setName("Ajax");
        dolphin2.setAge(3);
        return dolphin2;
    }

    private static List<Crab> createCrabs() {
        final Crab crab = new Crab("Alf", 5);
        final int height = 20;
        crab.setHeight(height);
        crab.setWeight(10);
        crab.setShell("Strong shell");

        final Crab crab2 = new Crab(25, 15, "Good shell");
        crab2.setName("Andy");
        crab2.setAge(10);

        final Crab crab3 = new Crab();
        crab3.setName("Angus");
        crab3.setAge(1);
        crab3.setHeight(10);
        crab3.setWeight(5);
        crab3.setShell("No shell");

        return Arrays.asList(crab, crab2, crab3);
    }


}

