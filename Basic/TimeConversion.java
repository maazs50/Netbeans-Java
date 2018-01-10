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
public class TimeConversion {
    public static void main(String args[]){
        float min=186;
        
         long hours=(long)min/60;
        int _min=(int)min%60;
        System.out.println(hours+":"+_min);
        
        
    }
}
