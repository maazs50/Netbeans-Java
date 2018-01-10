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
public class Prime {

    public static void main(String args[]) {
        int i, n = 20, prime = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                prime = prime + 1;

            }

        }
        if (prime == 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
