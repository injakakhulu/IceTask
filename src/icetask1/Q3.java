/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

/**
 *
 * @author RC_Student_lab
 */
public class Q3 {
  /*
 Write a Java program to create a class called Vehicle with a method called 
 drive(). Create a subclass called Car that overrides the drive() method to print 
 "Repairing a car"
 */
    void Drive() {
        System.out.println("I am Driving the Vehicle and Someone collides into me");
    }  
}

 class Car extends Q3 {

    @Override
    void Drive() {
        System.out.println("Repairing a car");
    }

    public static void driveCar() {
        Car myCar = new Car();
        myCar.Drive();
    }
}
