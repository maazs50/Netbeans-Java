/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0,r;
        System.out.println("Input the number");
        n=sc.nextInt();
        int m=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(m==sum)
            System.out.println("It is palindrome");
        else 
            System.out.println("It is not palindrome");
    }
}
