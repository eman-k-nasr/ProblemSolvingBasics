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
public class SequenceEquation {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(4, 3, 5,1,2);
    List<Integer> result = new ArrayList<>();
    for(int x =1 ; x<=list.size() ;x++){
        result.add(list.indexOf(list.indexOf(x)+1)+1);
    }
    System.out.println("result: "+result.toString());
    }
}
