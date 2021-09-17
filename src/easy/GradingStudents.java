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

class Result10 {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> roundedGrades = new ArrayList<>();
    for(int i = 0;i<grades.size();i++){
        if(grades.get(i) >= 38){
            int diff = 5 - (grades.get(i) % 5);
            int nextMultipleNumber = grades.get(i)+diff;
            if(Math.abs(grades.get(i) - nextMultipleNumber) < 3 ){
                roundedGrades.add(nextMultipleNumber);
            }else{
                roundedGrades.add(grades.get(i));
            }
            
        }else{
            roundedGrades.add(grades.get(i));
        }
    }
    return roundedGrades;
    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result10.gradingStudents(grades);
        System.out.println(result);
        bufferedReader.close();
        
    }
}

