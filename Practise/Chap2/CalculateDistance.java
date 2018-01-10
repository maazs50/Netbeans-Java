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
public class CalculateDistance {
    double distance=0.0f, u, t, a;
    
    Scanner sc=new Scanner(System.in);
    PrintWriter pw=new PrintWriter(System.out,true);
    
 public void input(){
    pw.println("Input the Inital velocity");
    u=sc.nextDouble();
        pw.println("Input the time");
        t=sc.nextDouble();
        pw.println("Input the acceleration");
        a=sc.nextDouble();
        
 }
 public void compute(){
     distance =((u*t)+(a*(t*t))/2);
     pw.println("The distance travelled is "+distance);
 }
    public static void main(String args[]){
        CalculateDistance dis=new CalculateDistance();
        dis.input();
        dis.compute();
    }
}
