/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;
/**
 *
 * @author admin
 */
class Employee
{
     private int empId;
    private String name;
    private String ssn;
    private double salary;
    public Employee(int eid,String name,String ssn,double sal)
    {  
        empId=eid;
        this.name=name;
        this.ssn=ssn;
        salary=sal;
         System.out.println("Constructor invoked");
    }
}
public class Manager extends Employee
{
    String dname;
    public Manager(int id,String name,String ssn,double sal,String deptname)
    {
            super(id,name,ssn,sal);
            dname=deptname;
    }
    public static void grantStock(Employee e)
    {
        if(e instanceof Manager)
        {
         Manager m=(Manager) e;
         
        }
        
        if(e instanceof Director)
        {
            Director d=(Director) e;
        }
    }
    public static void main(String args[])
    {
        Employee e=new Manager(1,"john","2312",34000,"sales");
        Employee d=new Director(3,"ram","21223",34212,"Admin",89000);
        grantStock(e);
        grantStock(d);
        
    }
    
}
