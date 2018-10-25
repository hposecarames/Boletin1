
package boletin1_3;

import javax.swing.JOptionPane;

public class Boletin1_3 {

    public static void main(String[] args) {
        
        double valorDolar, euros;
                
        valorDolar = 1.15;
        euros = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad en euros: "));
        JOptionPane.showMessageDialog(null, euros+" euros son "+euros * valorDolar+" dolares");
        
    }
    
}
