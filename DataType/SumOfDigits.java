/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class SumOfDigits {
    public static void main(String args[]){
        int f,s,t, sum=0, r;
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
int n=sc.nextInt();

f=n%10;
r=n/10;
s=r%10;
r=r/10;
t=r%10;


sum=f+s+t;
System.out.println("Addtion of the Digits "+sum);
    }
}
