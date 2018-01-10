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
public class ConvertTemperature {
    float f=0.0f,c;
Scanner sc=new Scanner(System.in);
PrintWriter pw=new PrintWriter(System.out,true);
public void input(){
    pw.println("Enter the temperature in Celsius");
    c=sc.nextFloat();
    
}
public void compute(){
    f=c*9/5+32;
    pw.println("The temperature in Fahrenheit is "+f);
}
public static void main(String args[]){
    ConvertTemperature obj=new ConvertTemperature();
  
    obj.input();
    obj.compute();
}
}
