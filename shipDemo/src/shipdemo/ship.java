/*
* Alvaro Ursua
* 'O Brien
* CS 236  
* 1/14/2019
* 
* This is a superclass called ship.java is reiled upon
* by cruiseShip.java and cragoShip.java
* It provides the name and year constuctors and overrides
* the toString method.
* 
* Complied using NetBeans v9
 */
package shipdemo;

public class ship {
    //sets up required variables for constructors
    
    String name;
    String year;
    String output;
    
    //sets then ship name
     public void setName(String n){
        name = n;
    }
     
     //gets the name of the ship when called
     public String getName(){
        return name;
    }
    //sets the year the ship was built
      public void setYear(String y){
        year = y;
    }
    //retrieves the year thte ship was buitl when called
     public String getYear(){
        return year;
    }
     
     //prints out the Name and Year of the ship when executed
    @Override
     public String toString(){
         
      System.out.println("Ship Name: " + name + " Year Built: " + year);
      
      return output;
     }
    
}
