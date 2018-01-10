/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
abstract class Bike{
    Bike(){
        System.out.println("Bike created");
    }
    abstract void run();
    void gearChanged(){
        System.out.println("Gear changed");
    }
}
public class Honda extends Bike{
void run(){
    System.out.println("Running safely");
}
   public static void main(String args[]){
        Bike obj=new Honda();
        obj.gearChanged();
        obj.run();
       
   }

  
}
