/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.*;

/**
 *
 * @author Mohammed Maaz S
 */
public class CollectionsDemo {
public static void main(String args[]) {
// create an array of string objs
String init =  "One, Two, Three, One, Two, Three" ;
// create one list
List<String> list = new ArrayList<>();
String r[]=init.split(",");
for(String temp:r){
    list.add(temp);
}
System.out.println("List value before: "+list);
// sort the list
Collections.sort(list);
System.out.println("List value after sort: "+list);
}
}