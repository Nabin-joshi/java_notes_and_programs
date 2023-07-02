import javax.swing.*;
import java.awt.*;

 class AWT_EVENT_1 extends Frame {
     AWT_EVENT_1(){
         Frame f = new Frame();

         Label l = new Label("name");
//         JLabel l = new JLabel("name");
         l.setBounds(400,400,30,30);
         l.setLocation(300,60);

         TextField textField = new TextField();
         textField.setBounds(400,400,30,30);
         textField.setCursor(Cursor.getDefaultCursor());
         textField.setLocation(300,60);

         TextField t2 = new TextField();

         Button button = new Button("Submit");

         f.add(l);
         f.add(textField);
         f.add(t2);
         f.add(button);
         f.setSize(400,400);
         f.setVisible(true);
     }

     public static void main(String[] args) {
         new AWT_EVENT_1();
     }
}
