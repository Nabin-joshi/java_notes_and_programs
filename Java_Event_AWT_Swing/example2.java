import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class example2 extends Frame  {

    example2(){
        Frame f = new Frame();

        Label name = new Label("Name");
        Label password = new Label("Password");

        TextField nameText = new TextField();
        TextField passwordText = new TextField();

        Button submit = new Button("Submit");

        Label result = new Label("");


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String name = nameText.getText();
               String password = passwordText.getText();
               if(Objects.equals(name, "nabin") && Objects.equals(password, "abc")){
                   result.setText("User login Success");
               }else {
                   result.setText(" login failed");
               }
            }
        });



        f.add(name);
        f.add(nameText);

        f.add(password);
        f.add(passwordText);

        f.add(result);

        f.add(submit);

        f.setVisible(true);
        f.setSize(800,800);
        f.setLayout(new FlowLayout());

    }

    public static void main(String[] args) {
        new example2();
    }



}
