package com.andrewProgramming;

public class Person {

  private String id;
  private String name;
  private String gender;

  /* This is default constructor */
  public Person() {
  }


  /* This is parameterized constructor */
  public Person(String id, String name, String gender) {
    this.id = id;
    this.name = name;
    this.gender = gender;
  }

  public static void main(String[] args) {
    //This will call default constructor
    Person andrew = new Person();

    //This is will call parameterized constructor
    Person kobe = new Person("1", "Kobe Bryant", "male");
  }
}
