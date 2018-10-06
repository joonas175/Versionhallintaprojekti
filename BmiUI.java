import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.*;

class BmiUI extends JFrame implements ActionListener{

    JButton calculate;
    JButton exit;
    JTextArea heigthtxt;
    JTextArea weigthtxt;
    JTextArea resultstxt;
    BmiLogic logic;

    public BmiUI(String[] args, BmiLogic newLogic) {

        logic = newLogic;
        calculate = new JButton("Calculate");
        exit = new JButton("Exit");
        heigthtxt = new JTextArea("Give heigth");
        weigthtxt = new JTextArea("Give weigth");
        resultstxt = new JTextArea("Results: ");
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        add(heigthtxt);
        add(weigthtxt);
        add(resultstxt);
        add(calculate);
        add(exit);
        calculate.addActionListener(this);
        exit.addActionListener(this);
        setTitle("BMI Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.calculate) {
            logic.setHeight(Integer.parseInt(this.heigthtxt.getText()));
            logic.setWeight(Integer.parseInt(this.weigthtxt.getText()));
            this.logic.generateBMI();
            this.resultstxt.setText("Result: " + this.logic.getBmiValue());
        }
    }
}