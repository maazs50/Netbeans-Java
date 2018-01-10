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
public class MatchingDigits {
    public static void main(String args[]){
     int f, s,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st input");
        f = sc.nextInt();
        System.out.println("Enter the 2nd input");
        s = sc.nextInt();
        System.out.println(result(f,s));
    }
    public static boolean result(int a, int b){
        
        int x,y,z;
        int x2,y2;
        x=a%10;
        y=b%10;
        x2=a/10;
        y2=b/10;
        
        
        
        
        if(x==x2||x==y2||y==x2||y==y2){
            return true;
        }
        else{
        return false;
        }
    }
}
