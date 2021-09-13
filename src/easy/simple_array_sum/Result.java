/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.simple_array_sum;

import java.util.List;

/**
 *
 * @author pc
 */
public class Result {
        /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> arr) {
    // Write your code here
    int sum = 0 ;
    if(arr.size() != 0){
        for (int i : arr) {
            sum += i;
    }
    }
    return sum ;
    }
}
