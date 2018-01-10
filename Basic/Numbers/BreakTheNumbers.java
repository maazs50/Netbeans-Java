/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic.Numbers;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class BreakTheNumbers {
    public static void main(String argsp[]){
        Scanner sc=new Scanner(System.in);
                System.out.println("Input an Integer with 6 digits");

        int n=sc.nextInt();
        int div=100000;
            int single=0;
            
            for(int i=0;i<6;i++){

                int n1=n/div%10;
       
       System.out.print(" "+n1);
       div=div/10;
            }
//        for(int i=0;i<=6;i++)
//        {
//            single=n%10;
//            System.out.print(single);
//        }
    }
}
