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

class Result17 {

    /*
    sample input:
    9
    10 5 20 20 4 5 2 25 1
    sample output 
    [2,4]
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int min = scores.get(0);
    int max = scores.get(0);
    List<Integer> records = new ArrayList<>();
    records.add(0);
    records.add(0);
    
    for(int i : scores){
        if(i>max){
            max = i;
            records.set(0,records.get(0)+1);
        }
        if(i<min){
            min = i;
            records.set(1,records.get(1)+1);
        }
    }
    return records;
    }

}

public class BreakingRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result17.breakingRecords(scores);

        System.out.println("result: "+result);
        bufferedReader.close();
        
    }
}

