/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

/**
 *
 * @author admin
 */
public class VarArgsExample {
    public float average(int ... nums)
    {
        int sum=0;
        for(int x:nums)
        {
            sum+=x;
        }
        return (float)(sum/nums.length);
    }
    public static void main(String args[])
    {
        VarArgsExample ob=new VarArgsExample();
        System.out.println("The average of 5 numbers are:"
                +ob.average(10,12,12,12));
        System.out.println("The average of 3 numbers are:"
                +ob.average(10,34,12));
        System.out.println("The average of 4 numbers are:"
                +ob.average(10,12,3,12));
    }
}
