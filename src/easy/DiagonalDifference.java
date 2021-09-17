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
3
11 2 4
4 5 6
10 8 -12
 */
class Result4 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int d1 = 0;
        int d2 = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            d1 += arr.get(i).get(n - 1 - i);
            d2 += arr.get(i).get(i);
        }
        return Math.abs(d1 - d2);
    }
}

public class DiagonalDifference {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result4.diagonalDifference(arr);
        System.out.println("diagonal difference = " + result);
        bufferedReader.close();

    }
}
