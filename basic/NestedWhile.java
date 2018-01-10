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
public class NestedWhile {
    public static void main(String argsp[]){
        int a=1,b;
        while(a<=10){
            b=1;
            while(b<=a){
                System.out.print("*\t");
                b++;
            }
            a++;
            System.out.println();
        }
    }
}
