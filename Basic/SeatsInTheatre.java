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
public class SeatsInTheatre {
    
    public static void main(String args[]){
    int seatsBlocked=SeatsInTheatre.seatsInTheater(16, 11,5, 3);
    System.out.println(seatsBlocked);
    
    
    }
public static int seatsInTheater(int nCols, int nRows, int col, int row) {
  return ((nCols - col) + 1) * (nRows - row);

}



    
}
