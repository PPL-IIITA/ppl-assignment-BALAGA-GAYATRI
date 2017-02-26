/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit2015130ppl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author lenovo pc
 */
public class iit2015130ppl {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int i;
        gift_basket gifts[] = new gift_basket[250];
        boy boys[] = new boy[40];
        girl girls[] = new girl[14];
        GENERATOR.generate(boys, girls);
        allocation.allocate(girls, boys);
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);
         for(i=0;i<40;i++){
             if(boys[i].STATUS == 1)
             {
                 System.out.println(boys[i].NAME+" "+boys[i].VALENTINE_NAME+" ");
             }
         }
        
    }
    
}
