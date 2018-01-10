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
public class TenaryOperator {
   public static void main(String args[]){
       int a=43, b=56, c=64, x;
       x=a>b?(a>c?a:c):(b>c?b:c);
       System.out.println("The max is :"+x);
   } 
}
