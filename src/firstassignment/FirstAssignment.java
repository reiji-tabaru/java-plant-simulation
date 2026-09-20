/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstassignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author zaoan
 */
public class FirstAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Plant> plants = new ArrayList<>();
        int days = 0;
        System.out.println("Enter the input file name");
        String fileName = sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileName));){
            
            int count = Integer.parseInt(br.readLine());
            
            for(int i = 0; i < count; i++){
                String line = br.readLine();
                String[] parts = line.split(" ");
                
                String name = parts[0];
                String plantType = parts[1];
                int nutrients = Integer.parseInt(parts[2]);
                
                Plant plant = createPlant(name, plantType, nutrients);
                plants.add(plant);
            }
            
            days = Integer.parseInt(br.readLine());   
        }catch(IOException e){
            e.printStackTrace();
        }
        Simulation simulation = new Simulation(plants, days);
        simulation.run();
         
    }
    
    private static Plant createPlant(String name, String type, int nutrients){
        switch(type){
            case "p":
                return new Puffs(name, nutrients);
            case "d":
                return new Deltatree(name, nutrients);
            case "b":
                return new Parabush(name, nutrients);
            default:
                throw new IllegalArgumentException("Plant type is wrong");
        }
    }
    
}
