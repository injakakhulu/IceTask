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
public class Q3 {
  public static void QuadraticEquation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("For quadratic equations");
        System.out.println("__________________________");
        System.out.println("");
         
        System.out.print("Input Value of a: ");
        double a = scan.nextDouble();
        System.out.print("Input Value of b: ");
        double b = scan.nextDouble();
        System.out.print("Input Value of c: ");
        double c = scan.nextDouble();
        double discriminant = b * b - 4 * a * c;
         
        if (discriminant > 0){
            double X1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double X2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are X = " + X1 + " and X = " + X2);
        } else if (discriminant == 0){
            double X3 = -b / (2 * a);
            System.out.println("Root is X = " + X3);
        } else{
            System.out.println("No real roots, X is undefined.");
        }
    }
  
}
