/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

/**
 *
 * @author Mohammed Maaz S
 */
public class Polymorphism {
    public static void main(String args[]){
        Polymorphism obj=new Polymorphism();
        System.out.println(obj.add(1, 3));
                System.out.println(obj.add(1, 3,5));
        System.out.println(obj.add(1.1f, 3.2f));

    }
    public int add(int a,int b){
            int result=a+b;
            return result;
        }
        public int add(int a,int b,int c){
            int result=a+b+c;
                return result;

        }
        public float add(float a, float b){
            float result=a+b;
                    return result;

        }
}
