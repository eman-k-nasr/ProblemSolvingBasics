/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
/*
sample input 
5
1000000001 1000000002 1000000003 1000000004 1000000005
*/
class Result3 {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        Long sum = 0L;
        for (Long n : ar) {
            sum += n;
        }
        return sum;
    }

}

public class VeryBigSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long result = Result3.aVeryBigSum(ar);
        System.out.println("big sum: " + result);
        bufferedReader.close();

    }
}
