import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.BorderLayout;

class BmiUI extends JFrame implements ActionListener{

    BorderLayout layout;
    JButton calculate;
    JButton exit;
    JTextArea heigthtxt;
    JTextArea weigthtxt;

    public BmiUI(String[] args) {
        calculate = new JButton("Calculate");
        exit = new JButton("Exit");
        heigthtxt = new JTextArea(1,20);
        layout = new BorderLayout();
        setLayout(layout);
        add(calculate,BorderLayout.PAGE_START);
        add(heigthtxt,BorderLayout.CENTER);
        add(exit,BorderLayout.PAGE_END);
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