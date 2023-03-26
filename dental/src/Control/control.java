package Control;
import GUI.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.DentalPaymentForm.*;

import static java.lang.System.exit;

public class control implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getCharge()){
            if(getInputName().getText().length() < 1){
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame,
                        "Enter your name please.",
                        "error",
                        JOptionPane.ERROR_MESSAGE);
            }else{
                int sum = 0;
                if(getOption1().isSelected()){
                    sum += 100000;
                }
                if (getOption2().isSelected()) {
                    sum += 1200000;
                }
                if (getOption3().isSelected())   {
                    sum += 200000;
                }
                int tooth = (int) getNumOfTooth().getValue();
                if(tooth >= 0){
                    sum += (tooth*80000);
                }else{
                    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                    JOptionPane.showMessageDialog(frame,
                            "tram rang error!!!",
                            "error",
                            JOptionPane.ERROR_MESSAGE);
                }
                getSum().setText("$"+sum);
            }
        }
        if (e.getSource() == getExit()) {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            int result = JOptionPane.showConfirmDialog(frame,
                    "are you sure",
                    "confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if(result == JOptionPane.YES_OPTION){
                exit(0);
            }
        }


    }
}



