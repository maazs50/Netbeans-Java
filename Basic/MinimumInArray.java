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
public class MinimumInArray {
    public static void  main(String argsp[]){
        int a[]={50, 90 , 6, 4, 80, 97};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            
        }
               System.out.println("Final answer "+min);

    }
}
