import java.awt.*;
import java.awt.event.*;

 class AWTExample extends Frame {
    private Button button;
    private TextField textField;

    public AWTExample() {
        setTitle("AWT Example");      // Set the title of the window
        setSize(300, 200);            // Set the size of the window

        button = new Button("Click"); // Create a button
        textField = new TextField();  // Create a text field

        button.setBounds(100, 50, 100, 30);       // Set the position and size of the button
        textField.setBounds(200, 200, 200, 50);   // Set the position and size of the text field

        add(button);                // Add the button to the frame
        add(textField);             // Add the text field to the frame

        setLayout(new FlowLayout());   // Set the layout manager for the frame

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Clicked!");  // Set the text of the text field when the button is clicked
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);    // Exit the application when the window is closed
            }
        });

        setVisible(true);           // Make the window visible
    }

    public static void main(String[] args) {
        AWTExample example = new AWTExample();
    }
}
