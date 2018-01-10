/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Euler;

/**
 *
 * @author Mohammed Maaz S
 */
public class SmallestMultiple {

    public static void main(String args[]) {
        boolean equal = false;
        int i = 1;

        while (equal==false) {
//            if (i % 1 == 0 && i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 10 == 0
//                    && i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
//                equal = true;
//            } else {
//                i++;
//            }
   i++;
boolean div=true;
for(int j=1;j<=20;j++){
   
    if(i%j!=0){
        div=false;
        break;
    }
   
  
}
 if(div==true){
        equal=true;
    }


        }
        System.out.println(i);
    }
}
