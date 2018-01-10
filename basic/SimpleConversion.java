/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Mohammed Maaz S
 */
public class SimpleConversion {
 public static void main(String args[]){
     double n=56.50;
     int a=(int) n;
     double p=(n-a)*100;
     System.out.println("Rs:"+a);
     System.out.println("Paisa: "+(int)p);
 }   
}
