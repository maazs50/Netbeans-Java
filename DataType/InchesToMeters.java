/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class InchesToMeters {
    public static void main(String args[]){
       double inches, meters;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the value for inches : ");
        inches=sc.nextDouble();
        meters=inches*0.0254;
System.out.println("This is "+meters+" meters");
    }
}
