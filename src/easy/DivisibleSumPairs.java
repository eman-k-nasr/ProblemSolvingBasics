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

class Result19 {

    /*
    input sample 
    6 3
    1 3 2 6 1 2
    output sample
    5
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int count = 0;
    for(int i =0;i<ar.size()-1;i++){
        for(int j =i+1;j<ar.size();j++){
            if((ar.get(i)+ar.get(j))% k == 0){
                count++;
            }
        }
    }
    return count;

    }

}

public class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result19.divisibleSumPairs(n, k, ar);
        System.out.println("result: "+result);
        bufferedReader.close();
    }
}

