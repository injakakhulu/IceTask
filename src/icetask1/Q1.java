/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

/**
 *
 * @author RC_Student_lab
 */
public class Q1 {
 
    static int Count = 0;

    public Q1() {
        Count = Count + 1;
    }

    public Q1(int count) {
        this.Count = count;
    }

    public void setCount() {
        this.Count = Count;
    }

    public int getCount() {
        return Count;
    }

    public static void Count() {
        System.out.println("Current Count: " + Count);
    }

}
