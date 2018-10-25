
package boletin1_4;

import javax.swing.JOptionPane;

public class Boletin1_4 {

    
    public static void main(String[] args) {
    
        double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce num1: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce num2: "));
        
        JOptionPane.showMessageDialog(null, "num1 + num2: "+(num1 + num2)+"\nnum1 - num2: "+(num1 - num2)+"\nnum1 * num2: "+(num1 * num2)+"\nnum1 / num2: "+(num1 / num2));
                 
    }
    
}
