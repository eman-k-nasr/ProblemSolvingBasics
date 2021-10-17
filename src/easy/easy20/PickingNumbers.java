/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy20;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'pickingNumbers' function below.
    sample input
     6
     1 2 2 3 1 2
    output 
     5
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int count = 0;
    int max = 0;
    Collections.sort(a);
    for(int i =0; i<a.size(); i++){
        count =0;
        for(int j=i; j<a.size(); j++){
           if(Math.abs(a.get(i)-a.get(j))<=1){
               count++;
           }             
        }
        if(count>max){
            max = count;
        }
    }
    return max;

    }

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result1.pickingNumbers(a);
        System.out.println("max num :"+result);
        
        bufferedReader.close();
    }
}
