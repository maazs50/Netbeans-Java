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
public class Director  extends Manager
{ 
    double budget;
    public Director(int eid,String name,String ssn,double sal,String dname,double bud)
    {
        super(eid,name,ssn,sal,dname);
        budget=bud;
    }
    public static void main(String args[])
    {
        Manager m=new Manager(1,"john","2312",34000,"sales");
        Employee e=new Employee(1,"john","2312",34000);
        Director d2=(Director)e;
        Director d1=(Director)m;
        Director d=new Director(3,"ram","21223",34212,"Admin",89000);
    }
}

