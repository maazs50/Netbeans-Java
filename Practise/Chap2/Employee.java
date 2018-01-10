/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise.Chap2;

import java.util.*;

/**
 *
 * @author Mohammed Maaz S
 */
public class Employee {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String empId, name, dept, dob, sal, ms;
    System.out.println("Enter the Employee ID");
    empId=sc.next();
    System.out.println("Enter the Employee Name");
    name=sc.next();
    System.out.println("Enter the Department");
    dept=sc.next();
    System.out.println("Enter Date of Birth");
    dob=sc.next();
    System.out.println("Enter the Salary");
    sal=sc.next();
    System.out.println("Enter the Marital Status");
    ms=sc.next();
    String[] detail=new String[6];
detail[0]=empId;
detail[1]=name;
detail[2]=dept;
detail[3]=dob;
detail[4]=sal;
detail[5]=ms;

for(String d:detail){
    System.out.println(d);
}

    }
}
