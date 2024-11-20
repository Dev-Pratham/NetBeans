/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author window
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    for(int i=0; i<=100; i=i+1)
        if(i==2 && i==3 && i==5 && i==7)
        {
            System.out.println("\n"+i);
        }
        else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
        {
                      System.out.println("\n"+i);
  
        }
    }
    
}
