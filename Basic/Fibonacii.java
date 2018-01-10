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
public class Fibonacii {
    public static void main(String args[]){
        int n=10;
        int f=0, s=1, fibo;
        System.out.println("Fibonacci Series");
        
        System.out.print(f+" "+s);
        
        for(int i=1;i<=n-1;i++){
            fibo=f+s;
            f=s;
            s=fibo;
            System.out.print(" "+fibo);
        }
        
    }
}
