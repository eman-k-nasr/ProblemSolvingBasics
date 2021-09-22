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

class Result16 {

    /*
sample input :
2 3
2 4
16 32 96
sample output:    
3
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int lcm = getLcmArr(a);
    int gcd = getGcdArr(b);
    int count = 0;
    for(int i = lcm; i<=gcd; i +=lcm){
        if(gcd % i == 0){
            count++;
        } 
    }
    return count;
    }
    public static int getGcdTwo(int x,int y){
        if(x==0) return y;
        if(y==0) return x;
        return getGcdTwo(y,x%y);
    }
    public static int getGcdArr(List<Integer> arr){
        int temp = arr.get(0);
        for(int i = 1; i<arr.size(); i++){
            temp = getGcdTwo(temp,arr.get(i));
        }
        return temp;
    }
    public static int getLcmArr(List<Integer> arr){
        int temp = arr.get(0);
        for(int i = 1; i<arr.size(); i++){
            temp = temp * arr.get(i) /getGcdTwo(temp,arr.get(i));
        }
        return temp;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result16.getTotalX(arr, brr);
        System.out.println("total: "+total);
        bufferedReader.close();
      
    }
}

