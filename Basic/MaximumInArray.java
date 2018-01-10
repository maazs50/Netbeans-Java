/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author Mohammed Maaz S
 */
public class MaximumInArray {
    public static void main(String args[]){
        int max=0, i; 
        int a[]={12,8,70,90,6, 185};
      for(i=0;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
      }
       System.out.println(a.length);
       System.out.println("Final answer "+max);
       
    }
}
