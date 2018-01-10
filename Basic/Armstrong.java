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
public class Armstrong {
    public static void main(String args[])
    {
int a=153, num=a, sum=0;
int remainder;
while(num>0){
remainder=num%10;
sum=sum+(remainder*remainder*remainder);
num=num/10;
    }
if(a==sum){
    System.out.println("Its an amrstrong number");
}else{
    System.out.println("Not an armstrong number");
}
    }
}
