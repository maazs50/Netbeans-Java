/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic.Numbers;

import java.util.Arrays;

/**
 *
 * @author Mohammed Maaz S
 */
public class nthPrimeNumbers {

  public static void main(String args[]) {
System.out.println(isPrime(13));
int i=1;
int num=1;
while(i<=10001)
{
    if(isPrime(num)){
        System.out.println(i+" : "+num);
        i++;
        num++;
        
    }
    else{
        num++;
    }
}
}

public static boolean isPrime(int num){
    int prime=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            prime=prime+1;
        }
    }
    if(prime==2){
        return true;
        
    }
    else{
        return false;
    }
}
}
