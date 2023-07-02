import java.awt.*;
import java.awt.event.*;

 class EventExample extends Frame implements ActionListener {
    private Button button;

    public EventExample() {
        button = new Button("Click Me");  // Create a button
        button.addActionListener(this); // Register the button for event handling
        add(button);                     // Add the button to the frame
        setSize(300, 200);               // Set the size of the frame
        setVisible(true);                // Make the frame visible
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {  // Check if the button was clicked
            System.out.println("Button clicked!");
        }
    }

    public static void main(String[] args) {
        EventExample example = new EventExample();
    }
}
