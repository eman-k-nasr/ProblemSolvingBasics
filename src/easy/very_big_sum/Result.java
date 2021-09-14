/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.very_big_sum;

import java.util.List;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
    Long sum = 0L;
    for(Long n : ar){
        sum += n;
    }
    System.out.println("big sum: "+sum);
    return sum;
    }

}
