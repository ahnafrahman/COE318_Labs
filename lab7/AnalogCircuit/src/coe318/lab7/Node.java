/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

public class Node {  
    
    //Instance variables associated with the node class
    public int idnum = 0;
    public static int next = 0;
    
   //Assigns ID number to constructed node.  
    public Node(){ 
        
        idnum = next;
        next++;
    }
    
   /** Return string representation of Node object. 
    * @return string representation of node
    */
    @Override
    public String toString(){   
        
        return ("" + this.idnum);
        
    }
}
