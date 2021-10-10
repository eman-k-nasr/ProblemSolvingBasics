/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy15;

import java.io.*;


class Result6 {

    /*
    input 
    20 23 6
    output 
    2
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
    int count = 0;
    for(int s=i;s<=j;s++){
        int num = s- reverse(s);
        if(num % k ==0){
            count++;
        }
    }
    return count;
    }
    
    public static int reverse(int number){
    int reverse = 0;
    while(number!=0){
        reverse = 10*reverse +number%10;
        number = number/10;
    }
    reverse += number;
    return reverse;
}

}

public class BeautifulDays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result6.beautifulDays(i, j, k);
        System.out.println("result"+result);
        bufferedReader.close();
    }
}

