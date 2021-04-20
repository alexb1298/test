package com.app;

import com.lists.MyList;
import com.machines.CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MachineRun {
    private static final int MAX_PRICE = 9999;
    private static final Random RANDOM = new Random();
    private static ArrayList<CoffeeMachine> arrayListMachines;
    private static List<CoffeeMachine> linkedListMachines;
    private static MyList<String> myListOfStrings;
    private static MyList<String> myListOfStrings2;

    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    private MachineRun() {
    }

    public static void main(final String[] args) {

        System.out.println("Press enter to continue the execution or type anything to exit.");
        runTasks();

    }

    private static void runTasks() {
            runTask2();
    }

    private static void runTask2() {
        CoffeeMachine[] coffeeMachines=new CoffeeMachine[0];
        if (isEnterKeyPressed()) {
            System.out.println("****   Hello. Welcome to our virtual COFFEE WORLD   ****");
            //TASK2
            final String coffee = "coffee";
            System.out.println("Be patient. Creating some " + coffee + " machines for you. The machines are stored" +
                    " into one array.");
            System.out.println();
            coffeeMachines = createMachines();
            for (final CoffeeMachine machine : coffeeMachines)
                System.out.println(machine.toString());
            System.out.println();
        }
        runTask3(coffeeMachines);
    }

    private static void runTask3(final CoffeeMachine[] coffeeMachines) {
        if (isEnterKeyPressed()) {
            //TASK3

            System.out.println("***************************************"
                    + "***********************************************");
            System.out.println("Transforming the array into ArrayList and Sorting it based on its price. ");
            arrayListMachines = transformArrayToList(coffeeMachines);
            printList(arrayListMachines, "Printing the ArrayList");

        }
        runTask4(arrayListMachines);
    }

    private static void runTask4(final ArrayList<CoffeeMachine> arrayListMachines) {

        if (isEnterKeyPressed()) {
            //TASK4
            System.out.println("******************************************" +
                    "********************************************");
            System.out.println("Transform the array list into a linked list and delete the third machine.");
            linkedListMachines = transformArrayListToLinkedList(arrayListMachines);
            printList(linkedListMachines, "Printing the LinkedList sorted based on price:");
        }
        runTask5(linkedListMachines);
    }

    private static void runTask5(final Iterable<CoffeeMachine> linkedListMachines) {
        Map<String, CoffeeMachine> hashMapMachines = new HashMap<>();
        if (isEnterKeyPressed()) {
            //TASK5
            System.out.println("**************************************************" +
                    "************************************");
            System.out.println("Transform the linkedList into HashMap.");
            hashMapMachines = transformLinkedListToHashMap(linkedListMachines);
            System.out.println("Printing the HashMap:");
            hashMapMachines.forEach((key, value) -> System.out.println(key + " --- " + value));
            System.out.println();
        }
        runTask6(hashMapMachines);
    }

    private static void runTask6(final Map<String, CoffeeMachine> hashMapMachines) {
        Map<String, CoffeeMachine> hashTableMachines = new Hashtable<>();
        if (isEnterKeyPressed()) {
            //TASK6
            System.out.println("********************************************" +
                    "******************************************");
            System.out.println("Transforming the HashMap into a HashTable.");
            hashTableMachines = transformHashMapToHashTable(hashMapMachines);
            System.out.println("Printing the hashTable with coffee machines:");
            for (final Map.Entry<String, CoffeeMachine> entry : hashTableMachines.entrySet())
                System.out.println(entry.getKey() + "--->" + entry.getValue());
            System.out.println();
        }
        runTask7(hashTableMachines);
    }

    private static void runTask7(final Map<String, CoffeeMachine> hashTableMachines) {
        Set<CoffeeMachine> hashSetMachines = new HashSet<>();
        if (isEnterKeyPressed()) {
            //TASK7
            System.out.println("***********************************************" +
                    "***************************************");
            System.out.println("Transforming the HashTable into HashSet.");
            hashSetMachines = transformHashTableToSet(hashTableMachines);
            System.out.println("Printing the HashSet with coffee machines:");
            for (final CoffeeMachine coffeeMachine : hashSetMachines) System.out.println(coffeeMachine.toString());
            System.out.println();
        }
        runTask8(hashSetMachines);

    }

    private static void runTask8(final Set<CoffeeMachine> hashSetMachines) {
        if (isEnterKeyPressed()) {
            //TASK8
            System.out.println("************************************************" +
                    "**************************************");
            System.out.println("Transforming the  HashSet into TreeSet sorted descending based on price");
            TreeSet<CoffeeMachine> treeSet = transformHashSetToTreeSet(hashSetMachines);
            treeSet = (TreeSet<CoffeeMachine>) treeSet.descendingSet();
            System.out.println("Printing the TreeSet:");
            for (final CoffeeMachine machine : treeSet)
                System.out.println(machine.toString());
            System.out.println();
        }
        runTask9();
    }

    private static void runTask9() {
        if (isEnterKeyPressed()) {
            //TASK9
            System.out.println("*************************************************" +
                    "*************************************");
            System.out.println("Comparing an arrayList to a linkedList .");
            arrayListMachines.remove(2);
            arrayListMachines.add(new CoffeeMachine("test", "ciao", RANDOM.nextInt(MAX_PRICE)));
            arrayListMachines.add(new CoffeeMachine("test33", "Model1", RANDOM.nextInt(MAX_PRICE)));
            linkedListMachines.remove(4);
            linkedListMachines.add(new CoffeeMachine("Machine1", "Model1", RANDOM.nextInt(MAX_PRICE)));
            linkedListMachines.add(new CoffeeMachine("Machine2", "Model2", RANDOM.nextInt(MAX_PRICE)));
            printDifferencesBetweenLists(arrayListMachines, linkedListMachines);
        }
        runtTask10();
    }

    private static void runtTask10() {

        if (isEnterKeyPressed()) {
            //TASK10
            System.out.println("***************************************************" +
                    "***********************************");
            printGreater(linkedListMachines);
            System.out.println();
        }
        runTask11();


    }

    private static void runTask11() {
        if (isEnterKeyPressed()) {
            //TASK11
            System.out.println("*****************************************************" +
                    "*********************************");
            System.out.println("Printing the category for each machine:");
            printCategory(linkedListMachines);
        }
        runTask13();

    }

    private static void runTask13() {
        if (isEnterKeyPressed()) {
            //TASK13
            System.out.println("*******************************************************" +
                    "*******************************");
            System.out.println("Return the size of the linkedList:");
            System.out.println(getSize(linkedListMachines));
        }
        runTask15();
    }

    private static void runTask15() {
        if (isEnterKeyPressed()) {

            //TASK15
            System.out.println("******************************************************" +
                    "********************************");
            System.out.println("Using MyList class methods.");
            myListOfStrings = new MyList<>();
            myListOfStrings2 = new MyList<>();
            usingMyListMethods(myListOfStrings, myListOfStrings2);
        }
        runTask16();
    }

    private static void runTask16() {
        if (isEnterKeyPressed()) {
            //TASK16
            System.out.println("******************************************************" +
                    "********************************");
            System.out.println("Transforming MyList objects into Vector.");
            myListOfStrings = new MyList<>();
            myListOfStrings.insert("Alex");
            myListOfStrings.insert("Corina");
            myListOfStrings.insert("Bach");
            System.out.println("The vector has the next objects:");
            final Iterable<String> vector = transformMyListToVector(myListOfStrings);
            for (final String word : vector) {
                System.out.println(word);
            }
            System.out.println();
        }
        runtTask17();
    }

    private static void runtTask17() {
        if (isEnterKeyPressed()) {
            //TASK17
            System.out.println("********************************************************" +
                    "******************************");
            System.out.println("Transforming  TreeMap objects into MyList.");
            myListOfStrings2 = transformTreeMapToMyList();
            System.out.println("MyList has the following elements");
            System.out.println(myListOfStrings2.toString());
            System.out.println();
        }
    }

    private static boolean isEnterKeyPressed() {
        String input = null;
        try {
            input = MachineRun.BUFFERED_READER.readLine();
        } catch (final IOException exception) {
            System.out.println(exception.getMessage());
        }
        assert input != null;
        if (!input.isEmpty()) {
            System.out.println("Exiting");
            return false;
        }
        return true;
    }

    //task 2
    private static CoffeeMachine[] createMachines() {
        final CoffeeMachine[] machines = new CoffeeMachine[8];
        machines[0] = new CoffeeMachine("Brand A", "Model A", RANDOM.nextInt(MAX_PRICE));
        machines[1] = new CoffeeMachine("Brand B", "Model B", RANDOM.nextInt(MAX_PRICE));
        machines[2] = new CoffeeMachine("Brand C", "Model C", RANDOM.nextInt(MAX_PRICE));
        machines[3] = new CoffeeMachine("Brand D", "Model D", RANDOM.nextInt(MAX_PRICE));
        machines[4] = new CoffeeMachine("Brand E", "Model E", RANDOM.nextInt(MAX_PRICE));
        machines[5] = new CoffeeMachine("Brand F", "Model F", RANDOM.nextInt(MAX_PRICE));
        machines[6] = new CoffeeMachine("Brand G", "Model G", RANDOM.nextInt(MAX_PRICE));
        machines[7] = new CoffeeMachine("Brand H", "Model H", RANDOM.nextInt(MAX_PRICE));

        return machines;
    }

    //TASK3
    private static ArrayList<CoffeeMachine> transformArrayToList(final CoffeeMachine[] array) {

        final ArrayList<CoffeeMachine> machines = new ArrayList<>(Arrays.asList(array));
        machines.add(new CoffeeMachine("Brand A", "Model XYZ", RANDOM.nextInt(MAX_PRICE)));
        machines.remove(4);
        Collections.sort(machines);
        return machines;
    }

    //TASK4
    private static List<CoffeeMachine> transformArrayListToLinkedList(final ArrayList<CoffeeMachine> array) {
        final List<CoffeeMachine> machines = new LinkedList<>(array);
        machines.remove(2);
        Collections.sort(machines);
        return machines;
    }

    //TASK5
    private static Map<String, CoffeeMachine> transformLinkedListToHashMap(final Iterable<CoffeeMachine> list) {
        final Map<String, CoffeeMachine> machines = new HashMap<>();
        final Iterator<CoffeeMachine> itr = list.iterator();
        CoffeeMachine machine;
        while (itr.hasNext()) {
            machine = itr.next();
            machines.put(machine.getModel(), machine);
        }
        return machines;
    }

    //TASK6
    private static Map<String, CoffeeMachine>
    transformHashMapToHashTable(final Map<String, CoffeeMachine> machineMap) {
        final Map<String, CoffeeMachine> table = new Hashtable<>();
        for (final Map.Entry<String, CoffeeMachine> entry : machineMap.entrySet())
            table.put(entry.getKey(), entry.getValue());
        return table;
    }

    //TASK7
    private static Set<CoffeeMachine> transformHashTableToSet(final Map<String, CoffeeMachine> table) {
        final Set<CoffeeMachine> set = new HashSet<>();
        table.forEach((key, value) -> System.out.println());
        table.forEach((key, value) -> set.add(value));
        return set;
    }

    //TASK8
    private static TreeSet<CoffeeMachine> transformHashSetToTreeSet(final Set<CoffeeMachine> hasSet) {
        return new TreeSet<>(hasSet);
    }

    //TASK9
    private static void printDifferencesBetweenLists(final List<CoffeeMachine> list1,
                                                     final List<CoffeeMachine> list2) {
        Collections.sort(list2);
        Collections.sort(list1);
        System.out.println("Printing the lists sorted based on price.");
        System.out.println();
        printList(list1, "First list:");
        printList(list2, "Second list:");
        printCommonAndMissingElements(list1, list2);


    }

    private static void printCommonAndMissingElements(final Collection<CoffeeMachine> list1,
                                                      final Collection<CoffeeMachine> list2) {
        final Collection<CoffeeMachine> common = new ArrayList<>();
        final Collection<CoffeeMachine> missing1 = new ArrayList<>();
        final Collection<CoffeeMachine> missing2 = new ArrayList<>();

        if (list1.equals(list2)) {
            System.out.println("The list are equal");
        } else {
            for (final CoffeeMachine machine : list1) {
                if (list2.contains(machine))
                    common.add(machine);
                else
                    missing1.add(machine);
            }

            for (final CoffeeMachine machine : list2) {
                if (!list1.contains(machine))
                    missing2.add(machine);
            }
        }

        printList(common, "The common elements between the list are:");
        printList(missing1, "The missing elements from list 2 are::");
        printList(missing2, "The missing elements from list 1 are:");

    }


    private static void printList(final Iterable<CoffeeMachine> list, final String message) {
        System.out.println();
        System.out.println(message);
        for (final CoffeeMachine machine : list)
            System.out.println(machine.toString());
    }

    //TASK10
    private static void printGreater(final Iterable<CoffeeMachine> linkedList) {
        final int price = 200;
        System.out.println("Printing the machines which has a price greater than 200 from the linked list:");
        System.out.println();
        for (final CoffeeMachine machine : linkedList)
            if (machine.getPrice() > price)
                System.out.println(machine.toString());
    }

    //TASK11
    private static void printCategory(final Iterable<CoffeeMachine> list) {
        final int number1 = 250;
        final int number2 = 750;
        for (final CoffeeMachine machine : list) {
            final int num = machine.getPrice();
            System.out.print(machine.toString() + "----> ");
            switch (isNumberBetween(1,number1,num) ? 0 :
                    isNumberBetween(number1,number2,num) ? 1 :
                            (num > number2) ? 2 : 3) {
                case 0:
                    System.out.print("Low-cost category.");
                    System.out.println();
                    break;
                case 1:
                    System.out.print("Average category.");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("High-cost category.");
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
    }
    private static boolean isNumberBetween(final int firstNumber, final int secondNumber, final int number)
    {
        return (firstNumber<=number && number<secondNumber);
    }
    //TASK13
    private static int getSize(final Collection<CoffeeMachine> list) {
        return list.size();
    }

    //TASK15
    private static void usingMyListMethods(final MyList<String> myList, final MyList<String> myList2) {
        myList.insert("Alex");
        myList.insert("Cecilia");
        myList.insert("Bach");
        myList.sort();
        System.out.println("First list:after sort operation:");
        System.out.println(myList.toString());
        myList2.insert("Bach");
        myList2.insert("Cecilia");
        myList2.insert("Alex");
        System.out.println("Second list:");
        System.out.println(myList2.toString());
        System.out.println("Comparing if the list are equal:" + myList.equals(myList2));
        System.out.println();
    }

    //TASK16
    private static Iterable<String> transformMyListToVector(final MyList<String> myList) {
        final Collection<String> vector = new Vector<>();
        for (int index = 0; index < myList.size(); index++)
            vector.add(myList.get(index));
        return vector;
    }

    //TASK17
    private static MyList<String> transformTreeMapToMyList() {
        final MyList<String> myList2 = new MyList<>();
        final Map<Integer, String> map = createTreeMap();
        map.forEach((key, value) -> myList2.insert(value));
        return myList2;
    }

    private static Map<Integer, String> createTreeMap() {
        final Map<Integer, String> map = new TreeMap<>();
        int key = 100;
        map.put(key, "Alex");
        key++;
        map.put(key, "Marcel");
        key++;
        map.put(key, "Mircea ");
        key++;
        map.put(key, "Catalin");

        return map;
    }
}
