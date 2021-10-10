/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy15;

import java.io.*;

class Result {

    /*
    input 5
    output 24 
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
    int shared = 5;
    int liked = 0;
    for(int i = 1; i<=n ; i++){
        shared = shared/2;
        liked += shared;
        shared *= 3;
    }
    return liked;
    }

}

public class ViralAdvertising {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);
        System.out.println("result "+result);
        bufferedReader.close();
    }
}
