/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class Multiple20 {
    public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                if(x>=100)
                {
                    System.out.print(s1+"      "+x);       
                }
            else
                {
                System.out.print(s1+"      0"+x);               
                }

            }
            
            System.out.println("================================");
                    }
}
