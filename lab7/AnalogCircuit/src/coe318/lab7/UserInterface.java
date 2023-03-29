/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

//Interface created to be used by the UserMain Class
public interface UserInterface {
             /**
             * Starts the program.
             */
             public void start();
             /**
             * Runs the program.
             */
             public void run();
             /**
             * Displays how the circuit should be 
             * created by the user.
             */
             public void display();
             /**
             * Displays the spice description of 
             * the circuit currently made.
             */
             public void spice();
             /**
             * Prints "All done" and terminates the program.
             */
             public void end();
}
