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

class Result20 {

    /*
    input
    6
    1 4 4 4 5 3
    output
    4
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    int freq[] = new int[5];
    for(int i : arr){
        freq[i-1]++;
    }
    
    int max =freq[0];
    int type = 0;
    for(int i=0;i<5;i++){
        if(freq[i]>max){
            max = freq[i];
            type = i;
        }
    }
    return type+1;
    }

}

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result20.migratoryBirds(arr);
        System.out.println("result: "+result);

        bufferedReader.close();
    }
}

