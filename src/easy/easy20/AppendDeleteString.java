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
public class AppendDeleteString {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(appendAndDelete("hackerhappy","hackerrank",9));
        System.out.println(appendAndDelete("abc","abc",7));
        System.out.println(appendAndDelete("y","yu",2));  
    }

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int count = 0;
        if (s.length() + t.length() <= k) {
            return "Yes";
        }
        int i = 0;
        for (i = 0; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        int deletions = s.length() - i;
        int appends = t.length() - i;
        int minOperations = deletions + appends;

        if (k < minOperations) {
            return "No";
        }

        if (k >= minOperations && (k - minOperations) % 2 == 0) {
            return "Yes";
        }

        return "No";
    }

}
