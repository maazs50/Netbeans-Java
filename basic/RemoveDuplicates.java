/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
import basic.MyDuplicateElements;
import static basic.MyDuplicateElements.removeDuplicates;
/**
 *
 * @author Mohammed Maaz S
 */
public class RemoveDuplicates {
    public static void main(String args[]){
        int a[]={10, 20, 10, 60, 30, 800};
        int b[]=removeDuplicates(a);
        System.out.println(b[0]);
    }
}
