package GUI;

import Control.control;

import javax.swing.*;
import java.awt.*;

public class DentalPaymentForm extends JFrame {
    private static JPanel form;
    private static JPanel toothPanel;
    private static JPanel chargePanel;
    private static JPanel buttonPanel;
    private static JPanel panelName;
    private static JPanel selection;
    private JLabel nameOfForm;
    private JLabel name;
    private static JTextField inputName;

    private static JCheckBox  option1;
    private static JLabel priceOption1;
    private static JCheckBox  option2;
    private static JLabel priceOption2;
    private static JCheckBox  option3;
    private static JLabel priceOption3;
    private static JLabel tooth;
    private static JSpinner numOfTooth;
    private static JLabel priceOption4;

    private JLabel total;
    private static JTextField sum;
    private static JButton exit;
    private static JButton charge;
    private final  int WIDTH = 400;
    private final  int HEIGHT = 400;

    public DentalPaymentForm() {
        setLooknFeel();
        setSize(WIDTH, HEIGHT);
        buildPanel();
        setVisible(true);
    }
    public void buildPanel(){
        nameOfForm = new JLabel("Dental Payment Form");
        nameOfForm.setForeground(Color.blue);
        nameOfForm.setFont(new Font("Times new Roman", Font.BOLD, 30));

        name = new JLabel("Ten Khach Hang");
        name.setFont(new Font("Times new Roman", Font.BOLD, 15));

        inputName = new JTextField(20);
        inputName.setFont(new Font("Times new Roman", Font.PLAIN, 15));

        option1 = new JCheckBox("Cao Voi");
        option1.setFont(new Font("Times new Roman", Font.PLAIN, 13));
        option1.addActionListener(new control());
        option2 = new JCheckBox("Tay Trang");
        option2.setFont(new Font("Times new Roman", Font.PLAIN,13));
        option2.addActionListener(new control());
        option3 = new JCheckBox("Chup Hinh Rang");
        option3.setFont(new Font("Times new Roman", Font.PLAIN,13));
        option3.addActionListener(new control());
        SpinnerNumberModel m_numberSpinnerModel = new SpinnerNumberModel(0,0,32,1);
        numOfTooth = new JSpinner(m_numberSpinnerModel);
        numOfTooth.setSize(20,5);
        numOfTooth.setFont(new Font("Times new Roman", Font.PLAIN,13));

        priceOption1 = new JLabel("$100.000",SwingConstants.RIGHT);
        priceOption1.setFont(new Font("Times new Roman", Font.BOLD, 13));
        priceOption2 = new JLabel("$1.200.000",SwingConstants.RIGHT);
        priceOption2.setFont(new Font("Times new Roman", Font.BOLD, 13));
        priceOption3 = new JLabel("$200.000",SwingConstants.RIGHT);
        priceOption3.setFont(new Font("Times new Roman", Font.BOLD, 13));
        priceOption4 = new JLabel("$80.000/cai",SwingConstants.RIGHT);
        priceOption4.setFont(new Font("Times new Roman", Font.BOLD, 13));


        tooth = new JLabel("Tram Rang:");
        tooth.setFont(new Font("Times new Roman", Font.PLAIN,13));
        toothPanel = new JPanel();

        sum = new JTextField(10);
        sum.setEditable(false);
        sum.setFont(new Font("Times new Roman", Font.PLAIN, 13));


        total = new JLabel("total:");
        total.setFont(new Font("Times new Roman", Font.BOLD,13));
        total.setAlignmentX(100);

        charge = new JButton("Tinh Tien");
        charge.setFont(new Font("Times new Roman", Font.BOLD,13));
        charge.addActionListener(new control());
        exit = new JButton("Thoat");
        exit.setFont(new Font("Times new Roman", Font.BOLD,13));
        exit.addActionListener(new control());


        form = new JPanel();
        panelName = new JPanel();
        panelName.add(name);
        panelName.add(inputName);

        toothPanel.add(tooth);
        toothPanel.add(numOfTooth);

        selection = new JPanel(new GridLayout(4,2,65,0));
        selection.add(option1);
        selection.add(priceOption1);
        selection.add(option2);
        selection.add(priceOption2);
        selection.add(option3);
        selection.add(priceOption3);
        selection.add(toothPanel);
        selection.add(priceOption4);




        chargePanel = new JPanel();


        chargePanel.add(total);
        chargePanel.add(sum);

        buttonPanel = new JPanel(new GridLayout(1,2,150,10));
        buttonPanel.add(exit);
        buttonPanel.add(charge);

        form.add(nameOfForm);
        form.add(panelName);
        form.add(selection);
        form.add(chargePanel);
        form.add(buttonPanel);

        add(form);






    }
    private void setLooknFeel() {
        //set Look n Feels
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception e) {
            System.out.println("Look and Feel is not set!");
        }
    }

    public static JCheckBox getOption1() {
        return option1;
    }

    public static JCheckBox getOption2() {
        return option2;
    }

    public static JCheckBox getOption3() {
        return option3;
    }

    public static JTextField getInputName() {
        return inputName;
    }

    public static JButton getExit() {
        return exit;
    }

    public static JButton getCharge() {
        return charge;
    }

    public static JSpinner getNumOfTooth() {
        return numOfTooth;
    }

    public static JTextField getSum() {
        return sum;
    }
}
