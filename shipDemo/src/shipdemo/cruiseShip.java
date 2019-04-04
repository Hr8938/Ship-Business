/*
* Alvaro Ursua
* 'O Brien
* CS 236  
* 1/14/2019
* 
* This is a program that allows users to setup and cruise ship
* using superclass ship.java and extending using 
* "cruiseShip.java"

* Complied using NetBeans v9
 */
package shipdemo;

public class cruiseShip extends ship{
    int max;
    
    //sets up max people constuctor
    public void  setMax(int m){
        max = m;
    }
    
    //retrieves max people
    public int getMax(){
        return max;
    }
    
    @Override
    //overrides the to string method in super. 
    //prints out the entered contructors
    
    final public String toString(){
         
      System.out.println("Ship Name: " + name + " Maximum Amount of Passengers: " + max);
      
      return output;
     }
}
