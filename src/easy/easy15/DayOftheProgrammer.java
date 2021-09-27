/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.easy15;

import java.io.*;

class Result21 {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    int sevenMonthTotalDays = 215; 
    int febDays=0;
    if(year<1918){
        febDays = year%4 == 0 ? 29 : 28;
    }else if(year>1918){
        febDays = year%400 == 0 || (year%4 ==0 && year%100!=0 )? 29 : 28;
    }else{
        febDays = 15;
    }
    int day = 256-(sevenMonthTotalDays+febDays);
    return day+".09."+year;
    }

}

public class DayOftheProgrammer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result21.dayOfProgrammer(year);
        System.out.println("day: "+result);

        bufferedReader.close();
    
    }
}
