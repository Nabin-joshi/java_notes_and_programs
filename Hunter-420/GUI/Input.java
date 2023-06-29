package GUI;
import java.awt.*;

/*
*author: Nischal Khanal
*date: 2023/06/29
*setSize,TextField,Label,Button,Font,setLayout
* Description: This program shows the use of AWT in Java to display a login window.

 */

public class Input extends Frame {
    Input(){

        setSize(100,300);
        setTitle("Login Window");

        TextField t = new TextField();
        t.setBounds(10,50,200,30);
        add(t);

        Label l = new Label("Username");
        l.setBounds(10,20,200,30);
        add(l);
        Font font = new Font("Arial",Font.BOLD,20);
        l.setFont(font);

        TextField t1 = new TextField();
        t1.setBounds(10,100,200,30);
        add(t1);
        Label l1 = new Label("Password");
        l1.setBounds(10,80,200,30);
        add(l1);

        Button b = new Button("Login");
        b.setBounds(30,120,100,30);
        add(b);
        setLayout(null);
        t1.setVisible(false);
    }


}
