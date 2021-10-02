/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy15;

import java.io.*;
import java.util.*;

public class CatAndMouse {

    // Complete the catAndMouse function below.
    //input 
//    2
//1 2 3
//1 3 2
    
    //output 
//    Cat B
//Mouse C
    
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(y-z) < Math.abs(x-z)){
            return"Cat B";
        }else if(Math.abs(y-z) > Math.abs(x-z)){
            return"Cat A";
        }else{
            return"Mouse C";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println("result: "+result);
        }
        scanner.close();
    }
}

