/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class BubbleSort {

    public static void main(String args[]) {
PrintWriter pw=new PrintWriter(System.out,true);
Scanner sc=new Scanner(System.in);

int i, j,k, temp, n ;
pw.println("Input the number of elements");
       n=sc.nextInt();
       int a[]=new int[n];
       pw.println("Enter the numbers");
       for(i=0;i<n-1;i++){
           pw.println("Enter the "+i+" element");
           a[i]=sc.nextInt();
       }
       for(i=0;i<n;i++){
           for(j=i+1;j<n;j++){
               if(a[j]<a[i])
               {
                   temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
               }
               
           }
       }
           
       pw.println("Bubble sort");
           for (i=0;i<n;i++)
               System.out.print("\t"+a[i]);
      
        
        
    }
}
