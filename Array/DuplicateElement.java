/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.*;

/**
 *
 * @author Mohammed Maaz S
 */
public class DuplicateElement {
public static void main(String args[]){
    System.out.println("Array elements");
    int[] a = {1,2,3,4,5,2};
    removeDuplicates(a);
   
   
}


public static void removeDuplicates(int a[]){
   int i=0;
    List<Integer> list=new ArrayList<>(a.length);
    for(i=0;i<a.length-1;i++){
        
   list.add(a[i]);
    
    }
    
    
    for(int num:a){
        System.out.print(" "+num);
    }
        System.out.println("");

    System.out.println("Sorted array");
    Set<Integer> sort= new HashSet<>(list);
    
    for (int n:sort){
        System.out.print(" "+n);
    }
    }
    
    
    
    
}
  

