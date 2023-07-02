import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 class FormExample extends Frame {
    private Label nameLabel, emailLabel, resultLabel;
    private TextField nameTextField, emailTextField;
    private Button submitButton;

    public FormExample() {

        // Set layout for the frame
        setLayout(new BorderLayout());

        // Create and add components
        nameLabel = new Label("Name:");
        add(nameLabel);

        nameTextField = new TextField(20);
        add(nameTextField);

        emailLabel = new Label("Email:");
        add(emailLabel);

        emailTextField = new TextField(20);
        add(emailTextField);

        submitButton = new Button("Submit");
        add(submitButton);

        resultLabel = new Label("");
        add(resultLabel);

        // Register event handler for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String email = emailTextField.getText();

                resultLabel.setText("Name: " + name + " | Email: " + email);
            }
        });

        // Set properties for the frame
        setTitle("Form Example");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormExample();
    }
}
