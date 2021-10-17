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
public class CircularArrayRotation {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
//    int rightRotations = 2;
//    int[] tempArr = new int[arr.length];
//    for(int i=0; i<arr.length; i++){
//        tempArr[(i+rightRotations)%arr.length]=arr[i];
//    }
//    System.out.println("after rotation: "+Arrays.toString(tempArr));
    int leftRotations = 2;
    int[] tempArr = new int[arr.length];
    for(int i=0; i<arr.length; i++){
        tempArr[(i+leftRotations+1)%arr.length]=arr[i];
    }
    System.out.println("after rotation: "+Arrays.toString(tempArr));
    }
}
