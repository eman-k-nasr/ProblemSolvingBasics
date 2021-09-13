/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class SolveMeFirst {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        System.out.println(solveMeFirst(a,b));
    }
    static int solveMeFirst(int a ,int b){
        return a + b ;
    }
}
