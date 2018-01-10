/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

/**
 *
 * @author Mohammed Maaz S
 */
public class Literate {
    public static void main(String args[]){
  final  float total=8000;
  float men=0, literate=0;
  System.out.println("Total population "+total);
 men=total/100*52;
  System.out.println("Men "+(int)men);
  literate=men/100*35;
  System.out.println("Literate Men "+(int)literate);
    }
}
