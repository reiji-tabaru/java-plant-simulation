/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstassignment;

import static firstassignment.Radiation.ALPHA;
import static firstassignment.Radiation.DELTA;
import static firstassignment.Radiation.NO_RADIATION;

/**
 *
 * @author zaoan
 */
public class Parabush extends Plant {
    public Parabush(String name, int n){
        super(name, n);
    }
    @Override
    public boolean isAlive(){
        if(this.nutrients <= 0){
            this.living = false;
        }
        return living;
    }
    @Override
    public void changeNutrients(Radiation radiation){
        switch (radiation){
            case ALPHA:
                this.nutrients += 1;
                break;
            case DELTA:
                this.nutrients += 1;
                break;   
            case NO_RADIATION:
                this.nutrients -= 1;
                break;
            default:
                throw new IllegalArgumentException("Radiation value is wrong");
        }
    }
    
    @Override
    public int getAlphaNeed(){
        return 0;
    }
    @Override 
    public int getDeltaNeed(){
        return 0;
    }
    @Override
    public String getPlantType(){
        return "(Parabush)";
    }
}
