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
public class MinimumOfArray {
    public static void main(String args[]){
        int i,n;
        
        Scanner sc=new Scanner(System.in);
        
       
       System.out.println("Input the limit");
       n=sc.nextInt();
        int a[]=new int[n];
       System.out.println("Input the numbers");
       for(i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       int min=a[0];
    for(i=0;i<=a.length-1;i++){
        if(a[i]<min){
            min=a[i];
        }
      
    }
    System.out.println("The minimum number in the array is "+min);  
}    
    }

