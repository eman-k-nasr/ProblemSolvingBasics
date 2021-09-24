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

class Result18 {

    /*
     * Complete the 'birthday' function below.
    input 
    5
    1 2 1 3 2
    3 2 
    output 
    2
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int count = 0;
    int sum = 0;
    int n = s.size();
    for(int i=0; i<= n-m; i++){
        sum = 0;
        for(int j=i;j<m+i; j++){
            sum += s.get(j);
        }
        if(sum == d){
            count++;
        }
    }
    return count;
    }

}

public class SubarrayDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result18.birthday(s, d, m);

        System.out.println("result: "+result);

        bufferedReader.close();
    }
}
