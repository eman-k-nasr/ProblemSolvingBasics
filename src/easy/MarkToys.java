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
7 50
1 12 5 111 200 1000 10
sample output 
4
*/
class Result14 {

    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */
    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        int sum = 0;
        int count = 0;
        if (k == 0) {
            return count;
        }
        Collections.sort(prices);
        for (int i = 0; i < prices.size(); i++) {
            k -= prices.get(i);
            if (k < 0) {
                return count;
            }
            count++;
        }
        return count;
    }

}

public class MarkToys {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result14.maximumToys(prices, k);
        System.out.println("maximum toys: " + result);

        bufferedReader.close();

    }
}
