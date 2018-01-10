/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class CalculatePercentage {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     double x,y,result;
     System.out.println("Enter the value");
     x=sc.nextDouble();
     System.out.println("Enter the percentage");
     y=sc.nextDouble();
     result=x*y/100;
     System.out.println(y+"% of "+x+" is "+result);
 }   
}
