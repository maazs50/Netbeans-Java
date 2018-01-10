/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class FindTheNo {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
   try{
        
        System.out.print("Input the no of elements : ");
    int n=sc.nextInt();
    int a[]=new int[n];
    int i, item ,k=0, pos=-1,j;
    System.out.println("Input "+n+" elements");
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Input the element to be searched");
    item=sc.nextInt();
   for (j=0;j<n;j++){
       if(a[j]==item){
           System.out.println("Element found at "+(j+1));
           break;
          
       }
   }
   if(j==n){
       
       System.out.println("Element not found"); 
   } 
    }
   catch(Exception e){
e.printStackTrace();

}
}


}
