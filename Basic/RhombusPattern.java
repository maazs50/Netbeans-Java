/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author Mohammed Maaz S
 */
public class RhombusPattern {

    public static void main(String args[]) {
        int n = 10;
        for (int i = 1; i <= n/2; i++) { //Outer loop which goes from 1 to 10 vertical lines
            
            for(int s=1;s<=n-i;s++){// Prints the space where it increases the variable but decreases the space
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");// Inner loop prints in the given condition pattern
            }
            System.out.println();//Shifts to new line
        }
        
        
   for(int i=n/2-1;i>=1;i--){
       for(int s=1;s<=n-i;s++){
           System.out.print(" ");
       }
       for(int j=1;j<=(i*2)-1;j++){
       System.out.print("*");
   }
    System.out.println();
   }
        
    }
}
