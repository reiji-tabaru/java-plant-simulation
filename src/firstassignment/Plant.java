package firstassignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zaoan
 */
public abstract class Plant {
    protected String name;
    protected int nutrients;
    protected boolean living;
/**
 * Creates a plant
 * @param name plant name
 * @param nutrients initial nutrients level
 */
    public Plant(String name, int nutrients){
        this.name = name;
        this.nutrients = nutrients;
        this.living = true;
    }
   
    public abstract boolean isAlive();
    
    public abstract void changeNutrients(Radiation radiation);
    
    public abstract int getAlphaNeed();
    public abstract int getDeltaNeed();
    
    public abstract String getPlantType();
    
    public String getName(){
        return this.name;
    }
    public int getNutrients(){
        return this.nutrients;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNutrients(int n){
        this.nutrients = n;
    }
    public void setLiving(boolean l){
        this.living = l;
    }
}
