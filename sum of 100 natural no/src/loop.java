/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author window
 */
public class loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // assuming that n=100 
        //this program will givw the sum of given natural no
        int i,sum,n=100;
        for(i=1,sum=0;i<=n;++i){
            System.out.println(i);
            sum=sum+i;
            System.out.println(" the sum of first "+ n +" natural no is "+sum);
        }
    }
    
}
