
/*
* Alvaro Ursua
* 'O Brien
* CS 236  
* 1/14/2019
* 
* This is a program that allows users to setup and cruise ship
* using superclass ship.java and extending using 
* "cargoShip.java"

* Complied using NetBeans v9
 */
package shipdemo;

/**
 *
 * @author alvaro
 */
public class cargoShip extends ship{
    
    int capacity;
    
    //sets up max weight constuctor
     public void setTonnage(int c){
        capacity = c;
    }
    
     //retrieves max weight
    public int getTonnage(){
        return capacity;
    }
    
    @Override
    //overrides the to string method in super. 
    //prints out the entered contructors
    public String toString(){
         
      System.out.println("Ship Name: " + name + " Ship Weight Capacity: " + capacity +" Tonnes");
      
      return output;
     }
    
    
    
    
}
