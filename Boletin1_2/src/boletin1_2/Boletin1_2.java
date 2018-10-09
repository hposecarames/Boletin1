
package boletin1_2;

import javax.swing.JOptionPane;

public class Boletin1_2 {

   
    public static void main(String[] args) {
        
        double lado;
        double area;
        lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado: "));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "El area es "+area);
    
    }
    
}
