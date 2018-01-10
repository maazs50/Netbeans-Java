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
public class DisplayDuplicateElement {
    public static void main(String args[]){
int i=0;
int a[]={78,44,30,20,10,30,44,50, 20,50};
while(i<a.length){    
System.out.print(a[i]+" ");
i++;
}
System.out.println();
    displayDuplicate(a);
    
    }

public static void displayDuplicate(int a[]){
int dup[]=new int[500];
int k=0;
for(int i=0;i<a.length;i++){
    for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
        dup[k]=a[j];
        k++;
        }
    }
}
System.out.println("List of duplicate elements");
for(int i=0;i<k;i++){
    System.out.print(" "+dup[i]);
}



    }
}
