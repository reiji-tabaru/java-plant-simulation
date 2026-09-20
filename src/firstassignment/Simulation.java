/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstassignment;


import java.util.List;
/**
 *
 * @author zaoan
 */
public class Simulation {
    private List<Plant> plants;
    private int days;
    private Radiation radiation;
    
    public Simulation(List<Plant> plants, int days){
        this.plants = plants;
        this.days =  days;
        this.radiation = Radiation.NO_RADIATION;
    }
    
    public void run(){
     
        for(int i = 1; i <= days; i++){
          
            
            int alpha = 0;
            int delta = 0;
            System.out.println("------Day " + i + "------");
            System.out.println("Radiation type: " + radiation);
            System.out.println();
            for (Plant p : plants){
                if(p.isAlive()){
                    p.changeNutrients(radiation);
                }
                
                if(p.isAlive()){              
                    System.out.printf("%-20s %-5s (%d)%n",
                            p.getName() + p.getPlantType(),
                            "Alive",
                            p.getNutrients());
                    
                    alpha += p.getAlphaNeed();
                    delta += p.getDeltaNeed();
                }else{
                    System.out.printf("%-20s %-5s (%d)%n",
                            p.getName() + p.getPlantType(),
                            "Dead",
                            p.getNutrients());
                   
                }
             
            }
            System.out.println();
            System.out.println("Alpha:" + alpha + ", Delta:" + delta);
            radiation = (alpha - delta >= 3) ? Radiation.ALPHA:
                        (delta - alpha >= 3) ? Radiation.DELTA:
                        Radiation.NO_RADIATION;
            
        }
        System.out.println();
        System.out.println("---Survivors---");
        for(Plant p : plants){
            if(p.isAlive()){
                System.out.printf("%-10s (%d)%n",
                        p.getName(),
                        p.getNutrients());
            }
        }
    }
    
}
