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
public class Problem1Multipleof3and5 {
    public static void main(String argsp[]){
        long result=0;
        for (int i=1;i<1000;i++){
            if(i%3==0||i%5==0){
            result =result+i;
        }
    }
    System.out.println(result);
    
    
    }
}
