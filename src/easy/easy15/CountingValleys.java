package easy.easy15;

import java.io.*;

class Result2 {

    /*
     * Complete the 'countingValleys' function below.
    input 
    8
UDDDUDUU
    output 
    1
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    int step = 0;
    int valleys = 0;
    for(char c : path.toCharArray()){
        if(c=='U'){
            step++;
            if(step == 0){
               valleys += 1; 
            }
        }else{
            step--;
        }
    }
    return valleys;

    }

}

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result2.countingValleys(steps, path);
        System.out.println("result: "+result);
        bufferedReader.close();
    }
}
