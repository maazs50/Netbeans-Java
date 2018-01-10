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
public class CodeFightsSrtings {
    public static void main(String args[]){
       
       String inputArray[] = {"aba", "aa", "ad", "vcd", "aba"};
int max=0,index=0;

List<String> outputArray=new ArrayList<>();



for(int i=0;i<inputArray.length;i++){
    
    if(inputArray[i].length()>max){
        max=inputArray[i].length();
    }
    if(inputArray[i].length()>=max){
outputArray.add(index,inputArray[i]);
    index++;
    }
}
for(String i:outputArray){
System.out.println(i);
}
    outputArray.toArray(new String[outputArray.size()]);
    
    }
}
