
package boletin1_4;

import javax.swing.JOptionPane;

public class Boletin1_4 {

    
    public static void main(String[] args) {
    
        double num1;
        double num2;
        double suma, resta, multiplicación,división;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce num1: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce num2: "));
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicación = num1 * num2;
        división = num1 / num2;
        
        JOptionPane.showMessageDialog(null, "num1 + num2: "+suma+"\nnum1 - num2: "+resta+"\nnum1 * num2: "+multiplicación+"\nnum1 / num2: "+división);
       
        
        
    }
    
}
