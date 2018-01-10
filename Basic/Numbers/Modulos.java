/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic.Numbers;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class Modulos {
    public static void main(String args[]){
       float div, mod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st input");
        int f = sc.nextInt();
        System.out.println("Enter the 2nd input");
     int   s = sc.nextInt();
      
     div=f/s;
        mod=f-(div*s);
 System.out.println((int)mod);
    }
}
