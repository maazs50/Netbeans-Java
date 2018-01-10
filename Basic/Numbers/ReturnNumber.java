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
public class ReturnNumber {

    public static void main(String args[]) {
        int f, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st input");
        f = sc.nextInt();
        System.out.println("Enter the 2nd input");
        s = sc.nextInt();
        System.out.println(number(f, s));
    }

    public static int number(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 6 == 0 && b % 6 == 0) {
            if (a < b) {
                return a;
            } else {
                return b;
            }
        }else{
                    if(a>b){
                    return a;
                    }else{
                        return b;
                    }
        }
    }
}
