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
public class CalculateVolume {
    
    PrintWriter pw=new PrintWriter(System.out,true);
    Scanner sc=new Scanner(System.in);

        double vol=0.00,n=3.14, h, r;
public void input(){
        pw.println("Enter the height of the cylinder");
h=sc.nextDouble();
pw.println("Enter the radius of the cylinder");
r=sc.nextDouble();
}
public void compute(){
vol=n*(r*r)*h;
pw.println("The volume of the cylinder is "+vol);
}
public static void main(String arg[]){
CalculateVolume comp=new CalculateVolume();

comp.input();
comp.compute();

}
}
