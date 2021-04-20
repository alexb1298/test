package com.machines;

import java.util.Objects;

public class CoffeeMachine implements Comparable<CoffeeMachine>{

    private boolean status;
    private final String brand;
    private final String model;
    private final int price;
    private double milk;


    public CoffeeMachine(final String brand, final String model, final int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.turnOn();
        this.provideMilk();
    }

    public String getModel() {
        return this.model;
    }

    public void provideMilk()
    {
        this.milk=this.milk+1.00;
    }

    public void turnOn()
    {
        this.status=true;
    }

    public void turnOff()
    {
        this.status=false;
    }

    public int getPrice()
    {
        return this.price;
    }

    public boolean hasMilk()
    {
        final double necessaryMilk=0.1;
        return this.milk >= necessaryMilk;
    }

    public void  ring()
    {
        System.out.println("RING RING RING");
        System.out.println("Enjoy your coffee. Have a nice day!");
    }

    public void makeCoffee()
    {
        if(this.status)
        {
            if(this.hasMilk())
            {
                System.out.println("Coffee is being prepared, please wait ");
                this.ring();
            }

            else
            {
                System.out.println("Sorry. The machine has no milk left.");
                //power off
                this.turnOff();
            }
        }
        else
            System.out.println("The machine isn't ready for making coffee. ");
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        final CoffeeMachine machine = (CoffeeMachine) object;
        return this.status == machine.status && this.price == machine.price &&
                Double.compare(machine.milk, this.milk) == 0 && this.brand.equals(machine.brand)
                && this.model.equals(machine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.status, this.brand, this.model, this.price, this.milk);
    }

    @Override
    public String toString() {
        return "status=" + this.status +
                ", brand='" + this.brand + '\'' +
                ", model='" + this.model + '\'' +
                ", price=" + this.price +
                ", milkLeft=" + this.milk;
    }

   @Override
    public int compareTo(final CoffeeMachine coffeeMachine) {
        if (this.getPrice()- coffeeMachine.getPrice()>0) return 1;
        else if(this.getPrice()== coffeeMachine.getPrice()) return 0;
        return -1;
    }
}
