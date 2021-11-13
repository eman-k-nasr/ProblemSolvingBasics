/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy20;

/**
 *
 * @author pc
 */
public class RepeatedString {

    public static void main(String[] args) {
        String s = "abcac";
        int n = 10;
        System.out.println("a counts: "+repeatedString(s,n));
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        long repeatedTimes = n / (s.length());
        long rem = n % (s.length());
        long aCount = countA(0, s.length(), s) * repeatedTimes;

        if (rem > 0) {
            aCount = aCount + countA(0, rem, s);
        }

        return aCount;
    }

    public static long countA(int s, long e, String str) {
        long aCount = 0;
        for (int i = s; i < e; i++) {
            if (str.charAt(i) == 'a') {
                aCount++;
            }
        }
        return aCount;
    }
}
