/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pc
 */
public class JumpingOnTheClouds {

    public static void main(String[] args) {
        System.out.println("jumps: "
                + jumpingOnClouds(
                        Arrays.asList(0, 1, 0,0,0,1,0)
                )
        );
    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;
        int i = 0;
        while (i < c.size() - 1) {
            if (i + 2 == c.size() || c.get(i + 2) == 1) {
                i++;
                jumps++;
            } else {
                i += 2;
                jumps++;
            }
        }
        return jumps;
    }
}
