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
public class CricketScorer {
    private int score=0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
   
    public void four(){
        score+=4;
    }
    public void six(){
        score+=6;
    }
    
}
