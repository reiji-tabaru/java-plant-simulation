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
public class Deltatree extends Plant {
    public Deltatree(String name, int n){
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
                this.nutrients -= 3;
                break;
            case DELTA:
                this.nutrients += 4;
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
        int need = 0;
        if(this.nutrients < 5){
            need =  4;
        }else if (this.nutrients >= 5 && this.nutrients <= 10){
            need = 1;
        }
        return need;
    }
    @Override
    public String getPlantType(){
        return "(Deltatree)";
    }
}
