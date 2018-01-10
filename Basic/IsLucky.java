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
public class IsLucky {
       public static void main(String args[]){

     IsLucky obj=new IsLucky();
      
       
       boolean a=obj.isLucky(134008);
}
       public boolean isLucky(int n){
           
           int len=String.valueOf(n).length();
System.out.println(len);
String firstHalf=String.valueOf(n).substring(0,len/2);
String secondHalf=String.valueOf(n).substring(len/2);
int fHalf=Integer.parseInt(firstHalf);
int sHalf=Integer.parseInt(secondHalf);
int sum1=0, sum2=0;

           System.out.println(firstHalf);

                   System.out.println(secondHalf);

        for(int i=1;i<=len/2-1;i++){
            int r=0;  
           r=fHalf%10;
           sum1+=r;
           fHalf=fHalf/10;
           System.out.println(fHalf);
           sum1+=fHalf;
           }
                for(int i=1;i<=len/2-1;i++){
            int r=0;  
           r=sHalf%10;
           sum2+=r;
           sHalf=sHalf/10;
           System.out.println(sHalf);
           sum2+=sHalf;
           }
        System.out.println("Sum of "+firstHalf+" = "+sum1);
                System.out.println("Sum of "+secondHalf+" = "+sum2);
if(sum1==sum2){
           return true;
}
else{
    return false;
}}
}