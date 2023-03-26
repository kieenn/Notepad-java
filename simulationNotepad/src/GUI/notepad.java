package GUI;

import Control.control;

import javax.swing.*;
import java.awt.*;

public class notepad extends JFrame{
    private static JMenuBar menuBar;
    private static JMenu Edit;
    private static JMenu View;
    private static JMenu Fonts;
    private static JMenu Zoom;
    private static JMenu Family;
    private static JMenu Style;
    private static JMenuItem New, Open, Save, SaveAS, Exit, Paste, Copy, Arial,Times, Cambria, Monospaced, Serif, SanSerif, Plain, Italic, Bold,  ZoomIn, ZoomOut;

    private static JTextArea text;
    private static control notepad;


    public notepad(){
//        setLookAndFeel();
        setSize(300,400);
        setTitle("Simulation notepad");
        notepad = new control();
        buildPanel();

        setVisible(true);
    }

    public void buildPanel(){
        menuBar = new JMenuBar();


        JMenu file = new JMenu("File");
        Edit = new JMenu("Edit");
        View = new JMenu("View");

        Zoom = new JMenu("Zoom");
        Family = new JMenu("Family");
        Style = new JMenu("Style");


        //File
        New = new JMenuItem("New");
        New.addActionListener(new control.Event());
        Open = new JMenuItem("Open");
        Open.addActionListener(new control.Event());
        Save = new JMenuItem("Save");
        Save.addActionListener(new control.Event());
        SaveAS = new JMenuItem("Save as");
        SaveAS.addActionListener(new control.Event());
        Exit = new JMenuItem("Exit");
        Exit.addActionListener(new control.Event());

        //Edit

        Paste = new JMenuItem("Paste");
        Paste.addActionListener(new control.Event());
        Copy =  new JMenuItem("Copy");
        Copy.addActionListener(new control.Event());

        Fonts = new JMenu("Font");

        Family = new JMenu("Family");
        Arial = new JMenuItem("Arial");
        Arial.addActionListener(new control.Event());
        Times = new JMenuItem("Times New Roman");
        Times.addActionListener(new control.Event());
        Cambria = new JMenuItem("Cambria");
        Cambria.addActionListener(new control.Event());
        Monospaced = new JMenuItem("Monospaced");
        Monospaced.addActionListener(new control.Event());
        Serif = new JMenuItem("Serif");
        Serif.addActionListener(new control.Event());
        SanSerif = new JMenuItem("SanSerif");
        SanSerif.addActionListener(new control.Event());


        Style = new JMenu("Style");
        Plain = new JMenuItem("Plain");
        Plain.addActionListener(new control.Event());
        Italic = new JMenuItem("Italic");
        Italic.addActionListener(new control.Event());
        Bold =new JMenuItem("Bold");
        Bold.addActionListener(new control.Event());


        //Zoom
        ZoomIn = new JMenuItem("Zoom In");
        ZoomIn.addActionListener(new control.Event());
        ZoomOut = new JMenuItem("Zoom out");
        ZoomOut.addActionListener(new control.Event());

        //add
        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(SaveAS);
        file.add(Exit);

        Edit.add(Paste);
        Edit.add(Copy);
        Edit.add(Fonts);

        Family.add(Arial);
        Family.add(Times);
        Family.add(Cambria);
        Family.add(Monospaced);
        Family.add(Serif);
        Family.add(SanSerif);
        Fonts.add(Family);

        Style.add(Plain);
        Style.add(Italic);
        Style.add(Bold);


        Fonts.add(Style);

        Zoom.add(ZoomIn);
        Zoom.add(ZoomOut);
        View.add(Zoom);

        menuBar.add(file);
        menuBar.add(Edit);
        menuBar.add(View);

        text = new JTextArea();
        text.setFont(new Font("Monospaced", Font.PLAIN, 14));


        setJMenuBar(menuBar);
        add(text);


    }

    public static JMenuItem getNew() {
        return New;
    }

    public static JMenuItem getOpen() {
        return Open;
    }

    public static JMenuItem getSave() {
        return Save;
    }

    public static JMenuItem getSaveAS() {
        return SaveAS;
    }

    public static JMenuItem getExit() {
        return Exit;
    }



    public static JMenuItem getPaste() {
        return Paste;
    }

    public static JMenuItem getCopy() {
        return Copy;
    }

    public static JMenuItem getArial() {
        return Arial;
    }

    public static JMenuItem getTimes() {
        return Times;
    }

    public static JMenuItem getCambria() {
        return Cambria;
    }

    public static JMenuItem getMonospaced() {
        return Monospaced;
    }

    public static JMenuItem getSerif() {
        return Serif;
    }

    public static JMenuItem getSanSerif() {
        return SanSerif;
    }

    public static JMenuItem getItalic() {
        return Italic;
    }

    public static JMenuItem getBold() {
        return Bold;
    }

    public static JMenuItem getPlain() {
        return Plain;
    }

    public static JMenuItem getZoomIn() {
        return ZoomIn;
    }

    public static JMenuItem getZoomOut() {
        return ZoomOut;
    }

    public static JTextArea getText() {
        return text;
    }

    private void setLookAndFeel() {
        //set Look n Feels
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception e) {
            System.out.println("Look and Feel is not set!");
        }
    }
}
