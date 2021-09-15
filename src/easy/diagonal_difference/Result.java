/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.diagonal_difference;
import java.util.*;
/**
 *
 * @emankamal
 */
public class Result {
        /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int d1 = 0;
    int d2 = 0;
    int n = arr.size();
    for(int i = 0 ; i<n ; i++){
        d1 += arr.get(i).get(n-1-i);
        d2 +=  arr.get(i).get(i);
    }
    System.out.println("diagonal difference = "+Math.abs(d1-d2));
    return Math.abs(d1-d2);
    }
}
