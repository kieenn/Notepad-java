package GUI;

import Control.control;

import javax.swing.*;
import java.awt.*;

public class gui extends JFrame{
    private static JButton redColor;
    private static JButton greenColor;
    private static JButton yellowColor;

    private static JLabel textI;

    private static JRadioButton Green;
    private static JRadioButton Blue;
    private static JRadioButton Cyan;
    private JPanel button;
    private JPanel RadioButton;
    private static  JPanel Label;

    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    public gui(){

        buildPanel();
        setSize(WIDTH, HEIGHT);

        redColor.addActionListener(new control());
        greenColor.addActionListener(new control());
        yellowColor.addActionListener(new control());

        Green.addActionListener(new control());
        Blue.addActionListener(new control());
        Cyan.addActionListener(new control());

        setVisible(true);

    }

    public void buildPanel(){
        setLooknFeel();
        redColor = new JButton("Red");
        redColor.setBackground(Color.RED);
        greenColor = new JButton("GREEN");
        greenColor.setBackground(Color.GREEN);
        yellowColor = new JButton("YELLOW");
        yellowColor.setBackground(Color.YELLOW);

        Green = new JRadioButton("Green");
        Green.setForeground(Color.GREEN);
        Blue = new JRadioButton("Blue");
        Blue.setForeground(Color.BLUE);
        Cyan = new JRadioButton("Cyan");
        Cyan.setForeground(Color.CYAN);

        textI = new JLabel("Top button to change the panel color and radio buttons change the text color", SwingConstants.CENTER);

        button = new JPanel();
        button.add(redColor);
        button.add(greenColor);
        button.add(yellowColor);

        RadioButton = new JPanel();
        ButtonGroup group = new ButtonGroup();
        group.add(Green);
        group.add(Blue);
        group.add(Cyan);


        RadioButton.add(Green);
        RadioButton.add(Blue);
        RadioButton.add(Cyan);

        Label = new JPanel();

        Label.add(textI);



        setLayout(new BorderLayout());
        add(button,"North");
        add(Label, "Center");
        add(RadioButton,"South");




    }

    public static JButton getRedColor() {
        return redColor;
    }

    public static JButton getGreenColor() {
        return greenColor;
    }

    public static JButton getYellowColor() {
        return yellowColor;
    }

    public static JRadioButton getBlue() {
        return Blue;
    }

    public static JRadioButton getCyan() {
        return Cyan;
    }

    public static JRadioButton getGreen() {
        return Green;
    }

    public static JLabel getTextI() {
        return textI;
    }

    public static JPanel getLabel() {
        return Label;
    }
    private void setLooknFeel() {
        //set Look n Feels
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception e) {
            System.out.println("Look and Feel is not set!");
        }
    }
}
