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
public class Learning {
     static int i=1;// i value will be incremented only when the method is called in the main method
    public static void main(String args[]){
   add();
    add2();
    }
    public static void add(){
        i++;    
        System.out.println(i);
    }
    public static void add2(){
        i++;
         System.out.println(i);

        i++;
        System.out.println(i);
    }
}
