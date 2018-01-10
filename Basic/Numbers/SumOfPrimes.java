/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic.Numbers;
import Basic.Numbers.SumOfPrimeNumbers;
/**
 *
 * @author  */
public class SumOfPrimes {
    public static void main(String argsp[]){
        int limit=2000000;
        int i=1, count=0;
        long sum=0;
        while(i<=limit){
            if(SumOfPrimeNumbers.isPrime(i)){
                sum+=i;
                count++;
            }
            i++;
        }
        System.out.println(count+"th element: total = "+sum);
    }
}
