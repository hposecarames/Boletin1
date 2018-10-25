
package boletin1_5;

import javax.swing.JOptionPane;

public class Boletin1_5 {

    
    public static void main(String[] args) {
       
        double valorMilla, milla;
                
        valorMilla = 1852;
        milla = Double.parseDouble(JOptionPane.showInputDialog("Introduce las millas: "));
        
        JOptionPane.showMessageDialog(null, milla+" millas son "+milla * valorMilla+"m");
        
    }
    
}
