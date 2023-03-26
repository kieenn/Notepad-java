package Control;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.gui.*;


public class control implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == getRedColor() ){
            getLabel().setBackground(Color.red);
        }
        else  if(e.getSource() == getGreenColor()){
            getLabel().setBackground(Color.green);
        }
        else  if(e.getSource() == getYellowColor()){
            getLabel().setBackground(Color.yellow);
        }

        if(getBlue().isSelected()){
            getTextI().setForeground(Color.blue);
        }
        else if(getGreen().isSelected()){
            getTextI().setForeground(Color.green);
        }else if(getCyan().isSelected()){
            getTextI().setForeground(Color.CYAN);
        }
    }
}
