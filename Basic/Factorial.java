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
public class Factorial {
    public static void main(String  args[]){
        int n=6, fact=1;
        System.out.println("Factorial of the number");
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
    System.out.println(fact);
    }
}
