/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

public class Voltage extends Circuit {
    
    //Instance variables created to be used by the voltage class
    private double voltage;
    private Node node1, node2;
    public int idv = 1;
    public static int nextv = 1;
    
    /**Constructor used to create voltage sources.Before creation, values must be checked
     * to see if possible. 
     * @param voltage voltage in Volts
     * @param no1 first connected node
     * @param no2 second connected node
     */
    public Voltage(double voltage, Node no1, Node no2){
        
       if (no1 == null || no2 == null || no1 == no2) {
           
            throw new IllegalArgumentException("Incorrect node assignment");
            
        } else if (no1.idnum < 0 || no2.idnum < 0) {
           
            throw new IllegalArgumentException("Node ID cannot be negative");
            
        } else {
            
           this.voltage = voltage;
           node1 = no1;
           node2 = no2;
           idv = nextv;
           nextv++;
        }
    }
    
    /**2 constructed nodes assigned to a voltage array then returned.
      * @return the array
      */
    public Node [] getNodes(){
        Node [] node = new Node[2];
        node[0] = node1;
        node[1] = node2;
        return node;
    }
    
    /** Method checks if second Node ID is greater than
     * first Node ID.
     * @return true or false
     */
    public boolean negative(){
        
        Node [] nodes = getNodes();
        return (nodes[0].idnum > nodes[1].idnum);
        
    }
    
     /** Returns the voltage source in a string representation. 
      * @return string representation of voltage source
      */
    @Override
    public String toString(){
        
        Node [] nodearray = getNodes();
        
        if (negative()){
            
        return("V" + idv + " " + nodearray[1] + " " + nodearray[0] + " DC " + -(this.voltage)); 
        
        } else {
            
          return("V" + idv + " " + nodearray[0] + " " + nodearray[1] + " DC " + this.voltage); 
        }   
    }
}