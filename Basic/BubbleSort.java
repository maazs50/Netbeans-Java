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
public class BubbleSort {
  
    
    
    
    
    


    public static void main(String args[]){
    int[] array={3,60,-1,35,2,45,320,5};
System.out.println("Array before sorting");
for(int i=0;i<array.length;i++){
    System.out.print(array[i]+" ");
}


System.out.println("");

System.out.println("After sorting");
bubble(array);
for(int a:array){
    System.out.print(a+" ");
}
}
public static void bubble(int a[]){
    
    int len=a.length;
    int temp;
    for(int i=0;i<len;i++){
        for(int j=1;j<(len-i);j++){
            if(a[j-1]>a[j])
            {
        
            temp=a[j-1];
            a[j-1]=a[j];
            a[j]=temp;
        
              }   
        
        }
    }
        
    
}
}
