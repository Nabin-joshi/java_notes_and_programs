//Number Guessing Game in Java Swing
//Also posted at

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Guess extends JFrame
{
    JTextField t1, t2, t3;
    JLabel j4;
    ButtonListener bl1;

    //setting random number in rand variable(for random number)
//    int rand=(int) (Math.random()*100);
    //for fixed number
    int rand=50;
    int count=0;

    public Guess()
    {

        Container c = getContentPane();


        c.setLayout(null);


        c.setBackground(Color.WHITE);




        JLabel j1=new JLabel("Enter a number b/w 1-100");
        j1.setFont(new Font("tunga",Font.PLAIN,17));
        j1.setSize(270,20);
        j1.setLocation(300,60);


        t1=new JTextField(10);
        t1.setSize(50,30);
        t1.setLocation(350,80);


        j4=new JLabel("Try and guess my number");
        j4.setFont(new Font("tunga",Font.PLAIN,17));
        j4.setSize(270,20);
        j4.setLocation(290,130);




        t3=new JTextField(10);
        t3.setSize(40,20);
        t3.setLocation(160,10);


        JLabel j6=new JLabel("Attempts");
        j6.setFont(new Font("tunga",Font.PLAIN,17));
        j6.setSize(270,20);
        j6.setLocation(210,10);

        //creating 3 buttons
        JButton b1=new JButton("Guess");
        b1.setSize(150,40);
        b1.setLocation(260,250);
        bl1=new ButtonListener();
        b1.addActionListener(bl1);




        c.add(j4);


        c.add(j1);
        c.add(t1);
        c.add(t3);
        c.add(b1);

        c.add(j6);


        t3.setEditable(false);


        setTitle("GUESS MY NUMBER");


        setSize(550,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonListener implements ActionListener
    {
        int bestScore=100;
        public void actionPerformed(ActionEvent e)
        {
            int a = Integer.parseInt(t1.getText());
            count=count+1;
            if(a<rand)
            {
                j4.setText(a+" is too low, try again!!");
            }
            else if(a>rand)
            {
                j4.setText(a+" is too high, try again!!");
            }
            else
            {
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Your Win: ");

            }
            t1.requestFocus();
            t1.selectAll();

            t3.setText(count+"");
        }
    }


    public static void main(String[] args)
    {
        new Guess();
    }
}

//public class JSwing {
//    public static void main(String[] args) {
//        JFrame jFrame = new JFrame();
//        String getMessage = JOptionPane.showInputDialog(jFrame, "Enter Number");
//        if(getMessage.toString().equals("10")){
//            JOptionPane.showMessageDialog(jFrame, "Your message: "+getMessage);
//        }else{
//            JOptionPane.showMessageDialog(jFrame, "Your failed: "+getMessage);
//
//        }

        //Number Guessing Game in Java Swing
//Also posted at


//   /