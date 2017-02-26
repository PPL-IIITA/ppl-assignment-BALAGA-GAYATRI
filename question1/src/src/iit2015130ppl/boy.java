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
public class boy {
    
    int NAME;
    int ATTRACTIVENESS;
    int INTELLIGENCE;
    int BUDGET;
    int HAPPINESS;
    int KIND;
    int STATUS;
    int VALENTINE_NAME;
    
    Random r = new Random();
    boy(int i){
          NAME = i+301;
          ATTRACTIVENESS = r.getRandomNumberInRange(1, 10);
          INTELLIGENCE = r.getRandomNumberInRange(1, 10);
          BUDGET = r.getRandomNumberInRange(1000, 5000);
          KIND = r.getRandomNumberInRange(1, 3);
          VALENTINE_NAME = 0;
          STATUS = 0;
           
    }
}
