package Control;
import GUI.notepad;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static GUI.notepad.*;
import static java.lang.System.exit;

public class control  {
    private static float size = 14f;
    private static String s="";
    private static String temp="";

    public control() {
    }
    public static  class Event implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == getNew()){
                new notepad();
            }
            if(e.getSource() == getOpen()){
                JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                int returnValue = jfc.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jfc.getSelectedFile();
                    System.out.println(selectedFile.getAbsolutePath());
                }
            }
            if(e.getSource() == getSave() || e.getSource() == getSaveAS()){
                JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

                // invoke the showsSaveDialog function to show the save dialog
                fileChooser.showSaveDialog(null);

            }
            if(e.getSource() == getExit()){
                exit(0);
            }
            if(e.getSource() == getCopy()){
                s = getText().getSelectedText();
            }
            if(e.getSource() == getPaste()){
                if(s==null){
                    s="";
                }
                temp = getText().getText();
                temp += s;

                getText().setText(temp);
            }
            if(e.getSource() == getArial()){
                getText().setFont(new Font(getArial().getText(), Font.PLAIN, (int)size));
            }
            if(e.getSource() == getTimes()){
                getText().setFont(new Font(getTimes().getText(), Font.PLAIN, (int)size));
            }
            if(e.getSource() == getCambria()){
                getText().setFont(new Font(getCambria().getText(), Font.PLAIN, (int)size));
            }
            if(e.getSource() == getMonospaced()){
                getText().setFont(new Font(getMonospaced().getText(), Font.PLAIN, (int)size));
            }
            if (e.getSource() == getSerif()){
                getText().setFont(new Font(getSerif().getText(), Font.PLAIN, (int)size));
            }
            if(e.getSource() == getSanSerif()){
                getText().setFont(new Font(getSanSerif().getText(), Font.PLAIN, (int)size));
            }
            if (e.getSource() == getItalic()){
                getText().setFont(getText().getFont().deriveFont(Font.ITALIC));
            }
            if (e.getSource() == getBold()){
                getText().setFont(getText().getFont().deriveFont(Font.BOLD));
            }
            if (e.getSource() == getPlain()){
                getText().setFont(getText().getFont().deriveFont(Font.PLAIN));
            }
            if(e.getSource() == getZoomOut()){
                size += 2;
                getText().setFont(getText().getFont().deriveFont(size));
            }
            if(e.getSource() == getZoomIn()){
                size -= 2;
                getText().setFont(getText().getFont().deriveFont(size));
            }

        }
    }



    public void setS(String s) {
        this.s = s;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

}
