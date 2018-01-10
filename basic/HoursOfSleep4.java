/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Mohammed Maaz S
 */
public class HoursOfSleep4 {
           
            public static void main(String a[]){
   int optimalSleep=7*8, weekDay=5, weekEnd=9;
   long actualSleep=((weekDay*5)+(weekEnd*2));
   
   System.out.println("Optimal Sleep " +optimalSleep+" hours");
   
   System.out.println("acutal Sleep "+actualSleep+" hours");
   if(actualSleep<optimalSleep){
  long Debt=optimalSleep-actualSleep;
       display(Debt);
   }else{
       System.out.println("No Debt");
   }
    }
public static void display(long l){
       System.out.println("Debt in Sleep "+l+" hours");
    
}
}
