/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author Mohammed Maaz S
 */
public class CommonCharacters {
   public static void main(String args[]){
       CommonCharacters obj=new CommonCharacters();
      
       
       int a=obj.commonCharacterCount("aabcc", "adcaa");
       System.out.println(a);
   }
   public int commonCharacterCount(String s1,String s2){
    int ans = 0;
    s1 = sortString(s1);
           System.out.println(s1);

    s2 = sortString(s2);
           System.out.println(s2);

    int index1 = 0, index2 = 0;
    while((index1 < s1.length()) && (index2 < s2.length())) {
if(s1.charAt(index1)==s2.charAt(index2))
{
    index1++;
    index2++;
    ans++;
}else if(s1.charAt(index1)>s2.charAt(index2)){
    index2++;
}else{
    index1++;
}
    }
    return ans;
}

String sortString(String s){
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    String ans = new String(arr);
    return ans;
}
}
