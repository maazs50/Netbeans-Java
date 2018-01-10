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
public class OddAndEven {
    public static void main(String args[]){
        int a[]={1,3,4,6,78,77,99,100,180,123};
        int even=0, odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++; 
            }
        }
        System.out.println("Number of odd elements "+odd);
        
        System.out.println("Number of even elements "+even);
        System.out.println("Length of the array "+a.length);
    }
}
