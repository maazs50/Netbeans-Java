/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Mohammed Maaz S
 */
public class DuplicateString {
    
public static void main(String args[]){
    System.out.println("Array elements");
    String[] a = {"Maaz","Waseem","Sibgath","Zahoor","Khalil","Maaz"};
    removeDuplicates(a);
   
   
}


public static void removeDuplicates(String a[]){
   int i=0;
    List<String> list=new ArrayList<>(a.length);
    for(i=0;i<a.length-1;i++){
        
   list.add(a[i]);
    
    }
    
    
    for(String num:a){
        System.out.print(" "+num);
    }
        System.out.println("");

    System.out.println("Sorted array");
    Set<String> sort= new HashSet<>(list);
    for (String n:sort){
        System.out.print(" "+n);
    }
    }
    
    
    
    
}
  

