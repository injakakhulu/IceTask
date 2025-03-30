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
public class Q4 {
 



    public static void Triangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Right angle Triangle with a Number");
        System.out.println("_____________________________________");
        System.out.println("");
         
        System.out.print("Enter a number to print as triangle: ");
        int t = scan.nextInt();
        for (int i = 0; i <= t; i++){
            for (int g = 1; g <= i; g++){
                System.out.print(g);
            }
            System.out.println("");
        }
        System.out.println(""); 
        System.out.println("____________THANK YOU______________");
    }
}
  

