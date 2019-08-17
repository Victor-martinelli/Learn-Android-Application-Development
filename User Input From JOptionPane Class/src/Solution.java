
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Portatil
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name;
        
        String surname;
        
        name = JOptionPane.showInputDialog("Please enter your name");
        
        surname = JOptionPane.showInputDialog("Please enter your surname");
        
        
        //Null means that the message will be shown in the middle of the screen
        JOptionPane.showMessageDialog(null, name +" "+ surname);
        
        int firstNumber;
        
        int secondNumber;
        
        String input;
        
        input = JOptionPane.showInputDialog("Please enter the first number");
        
        firstNumber = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Please enter the second number");
        
        secondNumber = Integer.parseInt(input);
        
        double average = (firstNumber+secondNumber)/2.0;
        
        JOptionPane.showMessageDialog(null, "Average: "+average);
        
    }
    
}
