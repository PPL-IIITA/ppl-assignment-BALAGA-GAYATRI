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
public class allocation {
    
    static void allocate(girl girls[], boy boys[]){
        int i,j, max, index;
        
        for(i=0;i<14;i++){
            switch (girls[i].BF_CHOOSING_CRITERION) {
                case 1:
                    max=0;  
                    index = -1;
                    for(j=0;j<40;j++){
                        if(boys[j].STATUS==0 && girls[i].MAINTENENCE <= boys[j].BUDGET){
                            if(boys[j].BUDGET>max){
                                max = boys[j].BUDGET;
                                index = j;
                            }
                        }
                    }
                    if(index==-1){
                        j=0;
                        while(true){
                            if(boys[j].STATUS ==0){
                                index=j;
                                break;
                            }
                            j++;
                        }
                    }
                        boys[index].STATUS = 1;
                        girls[i].STATUS = 1;
                        boys[index].VALENTINE_NAME = girls[i].NAME;
                       break;
                case 2:
                    max=0;
                    index=-1;
                    for(j=0;j<40;j++){
                        if(boys[j].STATUS==0 && girls[i].MAINTENENCE <= boys[j].BUDGET){
                            if(boys[j].INTELLIGENCE>max){
                                max = boys[j].INTELLIGENCE;
                                index = j;
                            }
                        }
                    }
                    if(index==-1){
                        j=0;
                        while(true){
                            if(boys[j].STATUS ==0){
                                index=j;
                                break;
                            }
                            j++;
                        }
                    }
                        boys[index].STATUS = 1;
                        girls[i].STATUS = 1;
                        boys[index].VALENTINE_NAME = girls[i].NAME;
                       break;
                case 3:
                    max=0;
                    index=-1;
                    for(j=0;j<30;j++){
                        if(boys[j].STATUS==0 && girls[i].MAINTENENCE <= boys[j].BUDGET){
                            if(boys[j].ATTRACTIVENESS >max){
                                max = boys[j].ATTRACTIVENESS;
                                index = j;
                            }
                        }
                    }
                    if(index==-1){
                        j=0;
                        while(true){
                            if(boys[j].STATUS ==0){
                                index=j;
                                break;
                            }
                            j++;
                        }
                    }
                        boys[index].STATUS = 1;
                        girls[i].STATUS= 1;
                        boys[index].VALENTINE_NAME = girls[i].NAME;
                       break;
                default:
                    break;
            }
        }    
        }
}
