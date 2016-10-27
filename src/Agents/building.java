/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

/**
 *
 * @author Johan
 */
public class building extends Agent{
    
    private int timeBuild; //Tiempo que toma construir el edificio
    private int numBuiders; //número de constructores
    private int typeBuild; //tipo de construcción, es muy posible que debamos construir más clases que hereden de esta para cada tipo de construcción
    
    public building(){
        setSpeed(0);
    }
    
    public int getTimeBuild(){
        return timeBuild;
    }
    
    public void setTimeBuild(int time){
        timeBuild = time;
    }
    
    public int getNumBuilders(){
        return numBuiders;
    }
    
    public void setnumBuilders(int num){
        numBuiders = num;
    }
    
    public int getTypeBuild(){
        return typeBuild;
    }
    
    public void setTypeBuild(int type){
        typeBuild = type;
    }
    
}
