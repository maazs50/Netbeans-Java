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
public class NonRecurring {
        public static void main(String argsp[]){
    char[] ch={'a','b','b','c','c','c','d'};    
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<ch.length;i++){
        for(int j=i+1;j<ch.length;j++){
            {
            if(ch[i]==ch[j]){
                break;
            } else if(ch[i]!=ch[j]){
                String temp=Character.toString(ch[i]);
                if(sb.toString().contains(temp)==false)
                sb.append(ch[i]+" ");
            }
        }
    }
    }
          System.out.println(sb.toString());
  }}
