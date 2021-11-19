/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author pc
 */
public class EqualizeTheArray {

    public static void main(String[] args) {
        
        System.out.println("counts" + equalizeArray(Arrays.asList(3,3,2,1,3)));
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int max = 1;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
                if (max < freq.get(i)) {
                    max = freq.get(i);
                }
            } else {
                freq.put(i, 1);
            }
        }
        return arr.size() - max;
    }
}
