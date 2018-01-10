/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class StarPattern1 {
    public StarPattern1(){
        
    }
    public static void main(String args[]){
    int i;
Scanner sc=new Scanner(System.in);    
        i=sc.nextInt();
       for(int j=1;j<=i;j++){
       
           for(int k=1;k<=j;k++){
           
           System.out.print("*");
    }
           System.out.println();
}
    }
}
