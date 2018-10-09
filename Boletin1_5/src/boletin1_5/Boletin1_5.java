
package boletin1_5;

import javax.swing.JOptionPane;

public class Boletin1_5 {

    
    public static void main(String[] args) {
       
        double valorMilla;
        double milla;
        double metros;
        
        valorMilla = 1852;
        milla = Double.parseDouble(JOptionPane.showInputDialog("Introduce las millas: "));
        metros = milla * valorMilla;
        
        JOptionPane.showMessageDialog(null, milla+" millas son "+metros+"m");
        
    }
    
}
