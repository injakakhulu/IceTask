/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IceTask2;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Q1 {
public static void PositiveORNegative() {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("__________________________");
        System.out.println("Positive or negative");
        System.out.println("__________________________");
        System.out.println("");
        while(true){
            System.out.print(" Enter Number  ");
            
            if (scan.hasNextInt()){
                num = scan.nextInt();
                break;
            } else{
                System.out.println("Invalid input please try again");
                scan.next();
            }
        }
        
        System.out.println("");
        if (num > 0){
            System.out.println("The number is " + num + " which is Positive ");
        } else if (num < 0){
            System.out.println("The number is " + num +" which is Negative ");
        } else{
            System.out.println("Number is " + num);
        }
    }
}

