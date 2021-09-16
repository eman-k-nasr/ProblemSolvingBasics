/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.io.*;


class Result7 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    for(int i =0;i<n;i++){
        for(int s=0;s<n-i-1;s++){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("#");
        }
        System.out.println();
    }

    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result7.staircase(n);

        bufferedReader.close();
    }
}

