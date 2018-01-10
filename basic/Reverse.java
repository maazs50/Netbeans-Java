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
public class Reverse {


 public static void main(String args[]){
 Reverse r=new Reverse();
 int a[]={3, -6, 2, -5, 7, -3};
 
 System.out.println(r.adjacentElementsProduct(a));
 }
public int adjacentElementsProduct(int[] a) {
int max=a[1]*a[2];
    for(int i=0;i<a.length-1;i++)    {
        if(a[i]*a[i+1]>max){
            max=a[i]*a[i+1];
        }
    }
    return max;
}

}
