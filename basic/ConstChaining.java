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
public class ConstChaining {
    public ConstChaining(){
        
    }
    public ConstChaining(String s){
        this();
        System.out.println("This is one parameterized Constructor");
    }
    public ConstChaining(String r, int i){
        this("Hello");
                System.out.println("This is second parameterized Constructor");

    }
    public ConstChaining(int i, int j, int k){
       this("World",2); 
                       System.out.println("This is Third parameterized Constructor");

    }
    public static void main(String args[]){
       ConstChaining obj=new ConstChaining(5,15,5); 
    }
}
