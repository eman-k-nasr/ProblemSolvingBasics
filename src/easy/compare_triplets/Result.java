/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.compare_triplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pc
 */
public class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> c = Arrays.asList(0, 0);
        if (a.size() == b.size()) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i)) {
                    c.set(0, c.get(0) + 1);
                }
                if (b.get(i) > a.get(i)) {
                    c.set(1, c.get(1) + 1);
                }
            }
        }
        System.out.println("list: "+c);
        return c;
    }
}
