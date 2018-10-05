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
    JTextArea results;

    public BmiUI(String[] args) {
        calculate = new JButton("Calculate");
        exit = new JButton("Exit");
        heigthtxt = new JTextArea("Give heigth");
        weigthtxt = new JTextArea("Give weigth");
        results = new JTextArea("Results: ");
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        add(heigthtxt);
        add(weigthtxt);
        add(results);
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
        
    }
}