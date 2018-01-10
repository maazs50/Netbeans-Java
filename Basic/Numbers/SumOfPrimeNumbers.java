/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic.Numbers;

/**
 *
 * @author Mohammed Maaz S
 */
public class SumOfPrimeNumbers {
    public static void main(String a[]){
        int i=1, sum=0, count=0;
                
               while(count<100){
                if(isPrime(i)){
                   sum=sum+i;              
                    
                    i++;
                    
                    count++;
               }
                else{
                    i++;
                }
               }
               System.out.println("Sum of prime numbers "+sum+" count"+count);
                
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public static boolean isPrime(int n){
       int prime=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                prime=prime+1;
            }
        }
        if(prime==2){
System.out.println(n);
            return true;
        }else
        {   return false;
        }
    }
    
}
