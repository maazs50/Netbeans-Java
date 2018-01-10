/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class DivisibleWithSecondNo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        int a, b;
       
        System.out.println("Enter the 1st No");
        a = sc.nextInt();
        System.out.println("Enter the 2nd No");
        b = sc.nextInt();        
        
        if(b%a==0||a%b==0)
        {
            System.out.println("Second number is divisible by "+a);
        }else{
            System.out.println("Not divisible");
        }
        }
}
