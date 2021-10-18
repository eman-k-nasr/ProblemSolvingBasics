/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy15;

/**
 *
 * @author pc
 */
public class CamelCase {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("number of words: "+camelcase("saveChangesInTheEditor"));
    }
    public static int camelcase(String s) {
    int count = 1;
    for(char c : s.toCharArray()){
        if(Character.isUpperCase(c)){
            count++;
        }
    }
    return count;

    }
}
