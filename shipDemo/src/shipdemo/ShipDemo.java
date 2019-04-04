/*
*  Alvaro Ursua
* 'O Brien
* CS 236  
* 1/14/2019
* 
* This is a program that allows users to create two types 
* of ships, either a cruise or a cargo
* using superclass ship.java and extending using 
* "cruiseShip.java" and "cargoShip.java"

* Complied using NetBeans v9
 */
package shipdemo;

//imnporting a wildcard of objects

import java.util.*;

public class ShipDemo {

 //main method
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         //Creates the option menu//
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|        Welcome to the Ship Building  Service           |");
        System.out.println("|--------------------------------------------------------|\n\n");
        
        //provides user options//
        System.out.println("Press \"1\" to create a Cruise Ship");
        System.out.println("Press \"2\" to create a Cargo Ship");
        int option = input.nextInt();
        
        //engages either cruise ship
        if (option == 1){
            makeCruise();
        
         //or cargo ship
        }else if (option == 2){
            makeCargo();
            
        }else if(option != 1 || option != 2 ){
            //if any other int is entered it fails
            System.out.println("Restart and Enter a Valid Option.");
        }
    }
    
    //this method creates the Cargo ship
     
    public static void makeCargo(){
        //Sets up scanner and cargo object
        Scanner input = new Scanner(System.in);
        cargoShip cargo = new cargoShip();
        
        //sets up variables to be passed to object calsses
        String name;
        int weight;
        
        //prompts ship name and passes it to constuctor
        System.out.println("Enter the Ship Name");
        name = input.nextLine();
        cargo.setName(name);
        
        //prompts ship person capacity and passes it to constuctor
        System.out.println("Enter the Ship's weight capacity");
        weight = input.nextInt();
        cargo.setTonnage(weight);
        
        //prints the ship deeetz
        System.out.println("Ship details:");
        cargo.toString();
     
      
    }
    
    //This method creates the cruise ship
    
    public static void  makeCruise(){
        //Sets up scanner and cruise object
        Scanner input = new Scanner(System.in);
        cruiseShip cruz = new cruiseShip();
        
        //sets up variables to be passed to object calsses
        String name;
        int people;
        
        //prompts ship name and passes it to constuctor
         System.out.println("Enter the Ship Name");
         name = input.nextLine();
         cruz.setName(name);
         
        //prompts ship person capacity and passes it to constuctor
        
         System.out.println("Enter the Ship's person capacity");
         people = input.nextInt();
         cruz.setMax(people);
         
         //prints the ship deeetz
         System.out.println("Ship details:");
         cruz.toString();
         
    }
    
 
}
