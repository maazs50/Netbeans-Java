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
public class StarPattern2 {

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
int space=0;        
        for (int i = n; i >= 1; i--) {

for(int s=1;s<=n-i;s++){
    System.out.print( " ");
}
        for(int j=1;j<=i;j++){
                
            System.out.print("*");
            
        }
            System.out.println();

        }
}
}