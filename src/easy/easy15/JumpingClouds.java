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
public class JumpingClouds {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] c = new int[]{0,0,1,0};
        int k = 2;
        System.out.println("current energy: "+getEnergy(c,k));
        
    }
    
    public static int getEnergy(int[] c,int k){
        int i = 0;
        int e  = 100;
        do{
            if(c[i]==1){
                e -= 3;
            }else{
                e -=1 ;
            }
            i = (i+k) % c.length;
        }while(i!=0);
        return e;
    }
        
        
}
