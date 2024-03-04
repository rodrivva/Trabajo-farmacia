package PaqG4;

import javax.swing.*;

public class UIFarmacia extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton dispensarButton;
    private JButton verMedicamentosDispensadosButton;
    private JButton reponerStockButton;
    private JButton verProspectoButton;
    private JTextArea textArea1;
    private JRadioButton verDispensador1RadioButton;
    private JRadioButton verDispensador2RadioButton;
    private JRadioButton verDispensador3RadioButton;
    private JRadioButton verDispensador4RadioButton;
    private JPanel farmacia;

    public UIFarmacia() {
        setTitle("Teoria");
        setSize(400, 300);
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(farmacia);
    }
    public static void main (String[] args){
        new UIFarmacia();
    }
}
