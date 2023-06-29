package GUI;

// Guess number using swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Guess extends JFrame implements ActionListener {
    JTextField t1;
    JButton b1;
    JLabel l1;
    int random;
    Guess(){
        Random r = new Random();
        random = r.nextInt(100);
        t1 = new JTextField();
        t1.setBounds(10,50,200,30);
        add(t1);
        b1 = new JButton("Guess");
        b1.setBounds(10,100,100,30);
        add(b1);
        l1 = new JLabel();
        l1.setBounds(10,150,200,30);
        add(l1);
        b1.addActionListener(this);
        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = t1.getText();
        int guess = Integer.parseInt(s);
        if(guess==random){
            l1.setText("You guessed it right");
        }
        else if(guess>random){
            l1.setText("Too high");
        }
        else{
            l1.setText("Too low");
        }
    }
}
class Use{
    public static void main(String[] args) {
        Guess g = new Guess();
    }
}
