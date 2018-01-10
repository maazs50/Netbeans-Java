/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Mohammed Maaz S
 */
public class AddAlternative {
    public static void main(String ags[]){
        int[] a={15,85,100,14,60};
int b[]=new int[2];
for(int i=0;i<a.length;i++){
    if(i%2==0){
        b[0]+=a[i];
    }
    else{
        b[1]+=a[i];
    }
}

for(int i:b)
System.out.print(i+" ");
    }
}
