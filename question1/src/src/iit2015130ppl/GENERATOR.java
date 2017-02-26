/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit2015130ppl;

/**
 *
 * @author lenovo pc
 */
public class GENERATOR {
    static void generate(boy boys[], girl girls[])
    {
        int i;
        Random r = new Random();
        for(i=0;i<14;i++)
        {
          girls[i] = new girl(i);  
        }
        for(i=0;i<40;i++)
        {
            boys[i] = new boy(i);
        }
    }
}
