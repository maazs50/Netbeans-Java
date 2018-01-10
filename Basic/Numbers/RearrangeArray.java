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
public class RearrangeArray {
    public static void main(String arg[]){
               int a[]={1,3,4,6,78,77,99,100,180,123};
int b[]=new int[a.length];
int i=0,j=0;
for(i=0;i<a.length;i++){
    if(a[i]%2==0){
        //save the even numbers
        b[j]=a[i];
        j++;
    }
}
i=0;
while(i<a.length){
    
    
if(a[i]%2!=0){
    b[j]=a[i];
    j++;
}    
i++;
}

for(int k=0;k<b.length;k++)
{System.out.print(" "+b[k]);
}   
    
    
    }
}
