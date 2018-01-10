/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic.Numbers;

/**
 *
 * @author Mohammed Maaz S
 */
public class MultiplyArrays {
  
    public static void main(String args[]){
        long startTime=System.nanoTime();
        String result="";
        int[] right={1,8,6,4};
        int[] left={45,9,7,2};
        for(int i=0;i<right.length;i++){
            int num1=right[i];
            int num2=left[i];
           // result=result+" "+Integer.toString(num1*num2)+"";
     if(i<right.length-1){
           System.out.print(num1*num2+" ,");
     }
     else{
         System.out.print(num1*num2+"");
     }
            
        }
        System.out.println();
        System.out.println(System.nanoTime()-startTime);
       }
    
}
