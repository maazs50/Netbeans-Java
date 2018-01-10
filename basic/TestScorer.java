/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author Mohammed Maaz S
 */
public class TestScorer extends CricketScorer{

   
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1,j,m;
        long total=0;
        Scanner sc=new Scanner(System.in);
        CricketScorer scorer=new CricketScorer();
         System.out.println("How many fours?");
         int n=sc.nextInt();
        for(i=1;i<=n;i++){
         scorer.four();
        }
                 System.out.println("How many six?");

        m=sc.nextInt();
        for (j=1;j<=m;j++){
            scorer.six();
        }
        System.out.println(scorer.getScore());
    }
    

}
