/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy20;

import java.io.*;
import java.util.stream.*;

class Result3 {

    /*
    sample input
    3
    0
    1
    4
    
    sample output
    1
    2
    7
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
    // Write your code here
    int height = 1;
    if(n==0)
     return 1;
    if(n%2==0){
        return utopianTree(n-1)+1;
    }else{
        return utopianTree(n-1)*2;
    }
    }

}

public class UtopianTree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result3.utopianTree(n);
                System.out.println("result"+ result);
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

