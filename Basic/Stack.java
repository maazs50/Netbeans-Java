/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.*;

/**
 *
 * @author Mohammed Maaz S
 */
public class Stack {

    public static void main(String a[]) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        stack.push("six");
        stack.push("seven");

        System.out.print(" " + stack);

        int size = stack.size() - 1;
        System.out.print("[");
        while (size >= 0) {
            System.out.print(" " + stack.pop());
            size--;
        }
        System.out.print("]");

    }
}
