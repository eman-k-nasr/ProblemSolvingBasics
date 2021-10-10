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

class Result4 {

    /*
sample input     
2
4 3
-1 -3 4 2
4 2
0 -1 2 1
output 
YES
NO    
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
    int count = 0;
    for(int i : a){
        if(i<=0){
            count++;
        }
    }
    if(count >= k){
        return "NO";
    }else{
        return "YES";
    }
    }

}

public class AngryProfesor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result4.angryProfessor(k, a);
                System.out.println("result"+result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
 
