
package boletin1_1;

import javax.swing.JOptionPane;

public class Boletin1_1 {

    public static void main(String[] args) {
        
        double base;
        double altura;
        double area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura: "));
        area = (base * altura)/2;
        
        JOptionPane.showMessageDialog(null,"El area es: "+area);
        
    
    }
}