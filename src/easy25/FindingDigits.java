/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy25;

/**
 *
 * @author pc
 */
public class FindingDigits {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("digits count: "+findDigits(124));
    }  
    public static int findDigits(int n) {
    // Write your code here
    int div = n;
    int count = 0;
    while(div > 0){
        int d = div % 10;
        if(d!=0 && n % d == 0){
            System.out.println("digit: "+d+","+n+"/"+d+"="+n/d);
            count++;
        }
        div = div / 10;
    }
    return count;
    }
}
