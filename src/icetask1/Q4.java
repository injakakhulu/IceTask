
package icetask1;

/**
 *
 * @author RC_Student_lab
 */
public class Q4 {
 /*
 Write a Java program to create a class called Employee with methods called 
 work() and getSalary(). Create a subclass called HRManager that overrides the 
 work() method and adds a new method called addEmployee(). 
 */
    double Salary = 15000.00;

    void Work() {
        System.out.println("Employee1 is working");
    }

    double getSalary() {
        return Salary;
    }
}

class HRManager extends Q4 {

    @Override
    void Work() {
        System.out.println("HR is impressed with employee1 and increases their salary");
        Salary = 20000.00;
    }

    void addEmployee() {
        System.out.println("HR adds Employee2 to the company");
    }

    public static void DoHRManager() {
        HRManager HR = new HRManager();
        System.out.println("Employee1's initial salary: R" + HR.getSalary());
        HR.Work(); 
        System.out.println("Now their Salary is: R" + HR.getSalary());
        HR.addEmployee();
    }
}
