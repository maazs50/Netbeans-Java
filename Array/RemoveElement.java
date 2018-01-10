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
public class RemoveElement {
public static void main(String args[]){
    List<String> l=new ArrayList<String>();
    l.add("One"); l.add("Two"); l.add("Three");
    l.add("Four");
    System.out.println(l);
   try{ 
       
       
       Scanner sc=new Scanner(System.in);
        System.out.println("The index size is "+l.size());

    System.out.println("Input the index element that you want to remove");
int i=sc.nextInt();

       if(i<0||i>l.size()){
           System.out.println(" The element you wnat to remove is out of index");
       }else{
l.remove(i-1);
    System.out.println(l);
   }
   }catch(Exception e){
       e.printStackTrace();
   }
}    
}
