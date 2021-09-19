/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.io.*;

/*
sample input 
0 2 5 3
sample output 
NO
*/
class Result12 {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    for(int i =0;i<10000;i++){
        x1 = x1 + v1;
        x2 = x2 + v2;
        if(x1 == x2){
            return "YES";
        }
    } 
    return "NO";
    }

}

public class NumberLineJumbs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result12.kangaroo(x1, v1, x2, v2);

        System.out.println(result);
     
        bufferedReader.close();
        
    }
}

