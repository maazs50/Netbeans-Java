/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType;
import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class SequenceOfIndividualDigits {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number");
        
        long i=sc.nextLong();
        long n1=i/10000%10;
        long n2=i/1000%10;
        long n3=i/100%10;
        long n4=i/10%10;
        long n5=i%10;
        System.out.print(n1+""+n2+""+n3+""+n4+""+n5);
        
        
        
        
    }
}
