/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType;

/**
 *
 * @author Mohammed Maaz S
 */
public class MinutesIntoDays {
 public static void main(String args[]){
     int min=3456789, days, hours, years;
     hours=min/60;
     days=hours/24;
     years= days/365;
     
     System.out.println(years+" Years "+days+" days");
 }   
}
