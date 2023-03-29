/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain implements UserInterface{
    
   // The instance variables associated with the UserMain class
   private ArrayList<Circuit> circuit = new ArrayList<>();
   private static Scanner in = new Scanner(System.in);
   
   /**
   * Start method from UserInterface is defined to start program.
   */
   @Override
   public void start(){
       
       display();
       run();
   }
   
   /**
   * Run method from UserInterface is defined to acquire user's input.
   */
   @Override
   public void run(){
       
       boolean run = true;
       
       while(run){
           
           String userinput = in.nextLine();
           
            if (userinput.equals("end") || userinput.equals("END")) {
                
            end();
            break; 
            
            } else if (userinput.equals("spice") || userinput.equals("SPICE")) {
                
              spice(); 
                    
            } else if (userinput.startsWith("v") || userinput.startsWith("V")){
                
                String delimitter = "[ ]+";
                String[] line = userinput.split(delimitter);
     
                Node n1 = new Node();
                n1.idnum = Integer.parseInt(line[1]);
                Node n2 = new Node();
                n2.idnum = Integer.parseInt(line[2]);
                Voltage vs = new Voltage(Double.parseDouble(line[3]),n1,n2);
                circuit.add(vs);
                
                
            } else if(userinput.startsWith("r") || userinput.startsWith("R")){
                
                String delimitter = "[ ]+";
                String[] line = userinput.split(delimitter);
                                                 
                Node n1 = new Node();
                n1.idnum = Integer.parseInt(line[1]);
                Node n2 = new Node();
                n2.idnum = Integer.parseInt(line[2]);
                Resistor r = new Resistor(Double.parseDouble(line[3]),n1,n2);
                circuit.add(r);
                
            } else {
                
                System.out.println("The syntax entered is incorrect.");
                System.out.println("Please enter a command, or 4 properties of circuit elements.");
            }   
        }
    }
   
   /**
   * display method from UserInterface is defined to print instructions.
   */
  @Override
   public void display(){
      
     System.out.println("Describe your electric circuit using Resistors or Voltage sources.");
   }
  
   /**
   * spice method from UserInterface is defined to print spice description.
   */
   @Override
   public void spice(){
       
       for(Circuit circ: circuit) {
           System.out.println(circ);
       }
   }
   
   /**
   * end method from UserInterface is defined to end the program.
   */
   @Override
   public void end(){
       
       System.out.println("All done.");
   }
   
    public static void main(String [] args){
        
       UserMain user = new UserMain();
       user.start();
    }
}
