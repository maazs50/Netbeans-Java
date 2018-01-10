/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Mohammed Maaz S
 */
public class BreakStatement {

    public static void main(String args[]) {
        int i;
        for (i = 0; i <= 20; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("Loop over");
    }
}
