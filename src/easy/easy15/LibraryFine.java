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
public class LibraryFine {
    public static void main(String[] args) {
        // TODO code application logic here
        //9 6 2015
        //6 6 2015
        System.out.println("fine: "+libraryFine(9,6,2015,6,6,2015));
    }
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    if(y1>y2){
        return 10000;
    }else if(y1==y2 && m1>m2){
        return 500 * (m1-m2);
    }else if(y1==y2 && m1==m2 && d1 > d2){
        return 15 * (d1-d2);
    }else{
        return 0;
    }
    }
}
