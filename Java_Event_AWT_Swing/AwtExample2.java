// importing Java AWT class  
import javax.swing.*;
import java.awt.*;

// class AWTExample2 directly creates instance of Frame class  
class AWTExample2 extends Frame {

   void AwtExample(){


       Frame frame = new Frame();


       Label l1 = new Label("Name");

       Button b1 = new Button("Submit");

       TextField t1 = new TextField("name");

       TextField t2 = new TextField("Email");

       add(l1);
       add(t1);
       add(t2);
       add(b1);

       setTitle("Example");
       setVisible(true);
       setLayout(null);
       setSize(400,400);

    }

    // main method
    public static void main(String args[]) {

// creating instance of Frame class   
        AWTExample2 awt_obj = new AWTExample2();

    }

}    