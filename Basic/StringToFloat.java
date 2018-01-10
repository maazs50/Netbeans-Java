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
public class StringToFloat {
    public static void main(String args[]){
   StringBuilder sb=new StringBuilder(100);
        String digits="1.1,2.2,3.3";
        float fsum=0.0f;
        Scanner sc=new Scanner(digits);
    sc.useDelimiter(",");
    while(sc.hasNext()){
        float f=sc.nextFloat();
        fsum+=f;
        sb.append(f+" ");
    }
    System.out.println(fsum);
    
    System.out.println(sb);
    }
}
