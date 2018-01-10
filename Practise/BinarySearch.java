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
public class BinarySearch {
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
   int i,search,n,f,l,mid;
   System.out.println("Enter the no of elements");
   n=sc.nextInt();
   int[] a=new int[n];
   System.out.println("Input the numbers");
   
   for(i=0;i<n;i++){
       a[i]=sc.nextInt();
   }
   f=0;
   l=n-1;
   mid=(f+l)/2;
   System.out.println("Enter the no to be searched");
   search=sc.nextInt();
   System.out.println("Binary search");
   while(f<=l){
       if(a[mid]==search){
         System.out.println("Element found at position "+(mid+1));
           break;
       }
       
       else if(a[mid]<search){
           f=mid+1;  
           
       } 
       else
       {
           l=mid-1;
       }
       mid=(l+f)/2;
       
   }
   if(f>l){
       System.out.println(search+ " is not present");
   }
  }  
}