/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Euler;

/**
 *
 * @author Mohammed Maaz S
 */
public class FIbonaci {
    //Adding even numbers (Fibonacii series)
    public static void main(String args[]){
        int first=1, second=1; 
        int limit=4000000;
       int fibo=0;
       int sum=0;
        while(fibo<limit){
            fibo=first+second;
            first=second;
second=fibo;            
if(fibo%2==0&&fibo<=limit)
{   System.out.println(fibo);
   sum=sum+fibo;   
}
        }
        System.out.println("Sum "+sum);
    }
}
