/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class BinarySearch {

    public static void main(String args[]) {
        int n, i, pos=-1, item, f , l, mid=0 ;
        PrintWriter pw = new PrintWriter(System.out, true);
        Scanner sc = new Scanner(System.in);
            pw.println("Input the no of elements : ");

        n = sc.nextInt();
        int a[] = new int[n];
        pw.println("Enter the elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
           
        }
         pw.println("Input the element to be searched");
            item = sc.nextInt();

        
        f=0; 
        l=n-1;
        while(f>l){
mid=(f+l)/2;
if(a[mid]==item){
    pos=mid+1;
}
else if( item>a[mid]){
    f=mid+1;
    
}else{
    l=mid-1;
}
    }
if(pos==-1){
    pw.println("Element not found");
}else{
    pw.println("Element found at location "+pos);
}
    }
    
}

/*    
 */
