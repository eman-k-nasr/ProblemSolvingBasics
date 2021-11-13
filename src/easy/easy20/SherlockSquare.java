/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy20;

/**
 *
 * @author pc
 */
public class SherlockSquare {

    public static void main(String[] args) {
        int start = 24;
        int end = 49;
        System.out.println("squares numbers found in range"
                + "["+start+","+end+"]");
        System.out.println(squares(start,end));
    }

    public static int squares(int a, int b) {
        // Write your code here
        double aSq = Math.sqrt(a);
        double bSq = Math.sqrt(b);

        return (int) Math.floor(bSq) - (int) Math.ceil(aSq) + 1;
    }
}
