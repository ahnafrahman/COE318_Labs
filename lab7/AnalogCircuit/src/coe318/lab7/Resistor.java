/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

public class Resistor extends Circuit {        
    
    private double resistance;
    private Node node1, node2;
    public int idr = 1;
    public static int nextr = 1;
    
    /**Constructor used to create resistors, exceptions must be made
     * to ensure values are possible.
     * @param resistance resistance in Ohms
     * @param one first connected node
     * @param two second connected node
     */
    public Resistor(double resistance, Node one, Node two){
        
       if(resistance <= 0) {
           
            throw new IllegalArgumentException("Resistance cannot be 0 or negative");
            
        } else if(one == null || two == null || one == two) {
            
            throw new IllegalArgumentException("Incorrect node assignment");
            
        } else if(one.idnum < 0 || two.idnum < 0) {
            
            throw new IllegalArgumentException("Node ID cannot be negative");
            
        } else {
            
           this.resistance = resistance;
           node1 = one;
           node2 = two;
           idr = nextr;
           nextr++;
        }
    }
    
    /**Method used to assign 2 constructed nodes to a resistor array and returns
      * the array.
      * @return the array
      */
    public Node [] getNodes(){
        Node [] node = new Node[2];
        node[0] = node1;
        node[1] = node2;
        return node;
    }
    
    /** Return string representation of Resistor object. 
     * @return the string representation of resistor
     */ 
    @Override
    public String toString(){
        
        Node [] nodearray = getNodes();
        return("R" + idr + " " + nodearray[0] + " " + nodearray[1] + " " + this.resistance);
        
    }
}
