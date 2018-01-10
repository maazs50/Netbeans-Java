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
public class TestStack {
 public static void main(String args[]){
     
     Deque<String> stack=new ArrayDeque<>();
     stack.push("One");
     stack.push("Two");
     stack.push("Three");
     int i=stack.size()-1;
     while(0<=i){
System.out.println(stack.pop()+" deleted");
i--;
 }   
if(i!=-1){System.out.println("Current stack"+ stack);
}

 }
}