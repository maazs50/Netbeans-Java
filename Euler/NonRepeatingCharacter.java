/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Euler;

/**
 *
 * @author Mohammed Maaz S
 */
public class NonRepeatingCharacter {
    public static void main(String args[]){
        char a=firstNotRepeatingCharacter("abacabad");
        System.out.println(a);
    }
    static char firstNotRepeatingCharacter(String s) {
char[] charArray=new char[1];
for(int i=0;i<s.length();i++)
{
    for(int j=i+1;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j)){
            
        }
    }
}

    charArray[0]='_';
    return charArray[0];
}
}
