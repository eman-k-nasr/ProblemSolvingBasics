/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.io.*;
class Result24 {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
    int flipsFromFront = p/2;
    int flipsFromBack = n/2 - p/2;
    return Math.min(flipsFromFront,flipsFromBack);

    }

}

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result24.pageCount(n, p);
        System.out.println("result: "+result);
        bufferedReader.close();
    }
}

