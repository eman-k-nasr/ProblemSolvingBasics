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

class Result5{
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float pCount = 0.0f;
    float nCount = 0.0f; 
    float zCount = 0.0f;
    for(int i : arr){
        if(i>0){
            pCount++;
        }
        if(i<0){
            nCount++;
        }
        if(i==0){
            zCount++;
        }
    }
    
    System.out.printf("%.6f \n",pCount/arr.size());
    System.out.printf("%.6f \n",nCount/arr.size());
    System.out.printf("%.6f \n",zCount/arr.size());
    }

}

public class PlusMinus {
        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result5.plusMinus(arr);

        bufferedReader.close();
    }
}
