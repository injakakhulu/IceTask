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
public class Q2 {
  public static void TimesTable() {
        Scanner scan = new Scanner(System.in);
        System.out.println("__________________________");
        System.out.println("Enter number for its Times table");
        System.out.println("__________________________");
        System.out.println("");
        
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        System.out.println("");
        System.out.println("__________________________");
    }
   
}
