package com.task;

public class Computer
{
  private final String manufacturer;
  private final String type;
  private final Keyboard keyboard;

  public Computer(final String manufacturer, final String type, final Keyboard keyboard)
  {
    this.manufacturer = manufacturer;
    this.type = type;
    this.keyboard = keyboard;
  }

  public void showDetails()
  {
    System.out.println("Computer Details:");
    System.out.println("1. The manufacturer -->" +this.manufacturer);
    System.out.println("2. The type -->" +this.type);
    System.out.println("3. The keyboard -->" + this.keyboard.toString());
  }

  public static void main(final String[] args)
  {
    System.out.println("******   Chapter 3   ******");

    final Keyboard keyboard=new Keyboard("gaming","2019");
    final Computer computer=new Computer("Asus","Gaming",keyboard);
    computer.showDetails();
  }

}
