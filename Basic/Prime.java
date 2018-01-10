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
public class Prime {
    public static void main(String argsp[]){
        int num=8, j=0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                j=j+1;
            }
    
        }
        if(j==2){
                     System.out.println("Its is a prime number");

        }
        else {
        System.out.println("Its not a prime number");   
        
        }
    }
    
    
}
