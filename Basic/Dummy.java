/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Mohammed Maaz S
 */
public class Dummy {
 public static void main(String args[]){
 Dummy d=new Dummy();
 int a[]={1,1,3,3,1};
 System.out.print( d.fiveDuplicate(a));
 
    
    
  }
 
 int firstDuplicate(int[] a) {
int num=1;
    
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
    if(a[i]==a[j])
    {
    num=a[j];
    break;
    }
        }
    }
    if(num!=-1){
        return num;
    }else
    {
        return -1;
    }
}
int fiveDuplicate(int a[]){
    int num=-1;
    for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
            if(a[i]==a[j])
            {
                num=a[j];
                break;
            }
            break;
        }
        break;
        
    }
     if(num!=-1){
        return num;
    }else
    {
        return -1;
    }
}
}