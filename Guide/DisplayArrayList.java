/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {

    public int id;
    public String name;
    public float sal;
    public static int count = 0;
//zero argument constructor. Gets called by default when an object is created for the Employee class

    public Employee() {
    }
//Parameterized Constructor

    public Employee(int id, String name, float sal) {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSal() {
        return sal;
    }

}

public class DisplayArrayList {

    static List<Employee> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        DisplayArrayList ob = new DisplayArrayList();
        ob.enterChoice();

//End of main() method
    }

    public void display() {
 
        int count=0;
        DisplayArrayList obj = new DisplayArrayList();
        for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
                 System.out.println("----Emplyee Details------");

               System.out.println("Count : "+count++);

            System.out.println("Employee Id : "+s.getId());
                        System.out.println("Employee Name : "+s.getName());

            System.out.println("Salary : "+s.getSal());
        }
        obj.enterChoice();

    }
//
    public void insert() {
        DisplayArrayList obj = new DisplayArrayList();

        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        float sal;
        System.out.println("----Emplyee Details------");
        System.out.println("Enter the Id");
        id = sc.nextInt();
        System.out.println("Enter the Name");
        name = sc.next();
        System.out.println(" Enter the Salary");
        sal = sc.nextFloat();
        list.add(new Employee(id, name, sal));
        obj.enterChoice();
    }

    public void enterChoice() {
        DisplayArrayList obj = new DisplayArrayList();

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Enter");
        System.out.println("2.display ");
        System.out.println("3.Exit");
        System.out.println("Enter the choice");

//list.add(new Employee(1, "Ravi",50.00f));
        choice = sc.nextInt();
        switch (choice) {

            case 1:
                obj.insert();
                break;
            case 2:
                obj.display();
                break;

            case 3:
                System.out.println("Thnak you!");
                exit(0);
        }
    }

}
