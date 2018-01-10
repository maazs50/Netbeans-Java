/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise.Chap2;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class Divisble {
  public static void main(String args[]){
      int i, j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      i=sc.nextInt();
System.out.println("Enter the second number");
j=sc.nextInt();
if(i%j==0){
    System.out.println("The number is divisible");
}
else{
    System.out.println("The number is not divisible");
}
  }  
}
