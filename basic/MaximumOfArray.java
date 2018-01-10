/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Mohammed Maaz S
 */
public class MaximumOfArray {
public static void main(String args[]){
    int i, max=0;
    int a[]={10,20,30,40,60,50,70};
    for(i=0;i<=a.length-1;i++){
        if(a[i]>max){
            max=a[i];
        }
       
    }
     System.out.println(max);
}    
}
