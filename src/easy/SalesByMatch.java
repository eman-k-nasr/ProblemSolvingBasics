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

class Result23 {

    /*
    sample input:
    9
    sample output:
    10 20 20 10 10 30 50 10 20
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    Set<Integer> set = new HashSet<Integer>();
    int pairs = 0;
    for(int i=0 ; i<n ;i++){
        int color = ar.get(i);
        if(set.contains(color)){
            set.remove(color);
            pairs++;
        }else{
            set.add(color);
        }
    }
    return pairs;
    }

}

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result23.sockMerchant(n, ar);
        
        System.out.println("number of pairs: "+result);

        bufferedReader.close();
    }
}

