
package boletin1_1;

import javax.swing.JOptionPane;

public class Boletin1_1 {

    public static void main(String[] args) {
        
        double base, altura;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura: "));
        
        JOptionPane.showMessageDialog(null,"El area es: "+(base * altura)/2);
    
    }
}