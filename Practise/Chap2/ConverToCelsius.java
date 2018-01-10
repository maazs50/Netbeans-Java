/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise.Chap2;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class ConverToCelsius {
    double f,c=0.0f;
    Scanner sc=new Scanner(System.in);
    PrintWriter pw=new PrintWriter(System.out,true);
    public void input(){
        pw.println("Enter the temperature in Fahrenheits");
        f=sc.nextDouble();
        
    }
    public void compute(){
        c=((f-32)*5)/9;
        pw.println(c+" Celsius");
    }
    public static void main(String args[]){
        ConverToCelsius obj=new ConverToCelsius();
        obj.input();
        obj.compute();
    }
}
