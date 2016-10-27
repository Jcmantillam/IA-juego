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
/*Super clase los demás agentes*/
public class Agent {//Definir luego el costo de construcción
    private int HP;
    private int speed;
    
    public int getHP(){
        return HP;
    }
    
    public void setHP(int HP){
        this.HP = HP;
    }    
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
