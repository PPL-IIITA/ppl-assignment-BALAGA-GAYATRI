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
public class girl {
    int NAME;
    int INTELLIGENCE;
    int ATTRACTIVENESS;
    int MAINTENENCE;
    float HAPPINESS;
    int BF_CHOOSING_CRITERION;
    int KIND;
    int STATUS;
    Random r = new Random();
    girl(int i){
          NAME = i+601;
          ATTRACTIVENESS = r.getRandomNumberInRange(1, 10);
          INTELLIGENCE = r.getRandomNumberInRange(1, 10);
          MAINTENENCE = r.getRandomNumberInRange(1000, 5000);
          KIND = r.getRandomNumberInRange(1, 3);
          BF_CHOOSING_CRITERION = r.getRandomNumberInRange(1, 3);
          STATUS = 0;
            
          
    }
          
}
