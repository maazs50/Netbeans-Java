/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
import java.lang.*;

public class Arrays {

    public static void main(String args[]){
       int i=0;
        int[] numbers={100, 200, 300};
        int count=numbers.length;
        System.out.println("The length of the array is : " + count);
     try{   
        while(i<=numbers.length-1){
            System.out.println("Number : " +numbers[i]);
            i++;
        }
     }
     catch(Exception e){
         System.out.println(e);
     }
    }

    static int asList(String[] init) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
