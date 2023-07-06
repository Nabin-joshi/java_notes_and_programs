package Java_Event_AWT_Swing;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class examQuestion extends Frame  {
    private static JDialog d;

    public examQuestion(){
        Frame f = new Frame("Exam Question");

        Label name = new Label("Name");
        name.setLocation(250,40);
        Label password = new Label("Password");
        name.setLocation(200,30);


        Label result = new Label("");
        result.setLocation(300,60);


        TextField nameText = new TextField();
        TextField passwordText = new TextField();

        Button submitButton = new Button("Submit");

        f.add(name);
        f.add(nameText);
        f.add(password);
        f.add(passwordText);

        f.add(result);

        f.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String text = nameText.getText();
               String password = passwordText.getText();

               if (Objects.equals(text, "nabin") && Objects.equals(password, "abc")){
                   d.setVisible(true);
                   result.setText("User login Success");
               }else {
                   result.setText("Login Failed");
               }

            }
        });


        d = new JDialog(f , "Dialog Example", true);
        d.setLayout( new FlowLayout() );
        JButton b = new JButton ("OK");
        b.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                d.setVisible(false);
            }
        });
        d.add( new JLabel ("User Login Success."));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(false);


        f.setSize(800,800);
        f.setLayout(new FlowLayout());
        f.setVisible(true);


    }



    public static void main(String[] args) {
            new examQuestion();
    }

}
