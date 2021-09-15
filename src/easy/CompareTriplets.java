/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

 class Result2 {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> c = Arrays.asList(0, 0);
        if (a.size() == b.size()) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i)) {
                    c.set(0, c.get(0) + 1);
                }
                if (b.get(i) > a.get(i)) {
                    c.set(1, c.get(1) + 1);
                }
            }
        }
        System.out.println("list: "+c);
        return c;
    }
}
public class CompareTriplets {
        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = 
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = 
                new BufferedWriter(new FileWriter("compare triplets"));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result2.compareTriplets(a, b);
       
        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
