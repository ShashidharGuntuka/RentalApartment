import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    // Components
    private JTextField nameField;
    private JTextField mailIdField;
    private JTextField phoneNumberField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JTextField cityField;
    private JTextField stateField;
    private JTextField zipCodeField;
    private JButton submitButton;

    public RegistrationForm() {
        // Create JFrame
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 2));

        // Add components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel mailIdLabel = new JLabel("Mail ID:");
        mailIdField = new JTextField();
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        JLabel cityLabel = new JLabel("City:");
        cityField = new JTextField();
         JLabel stateLabel = new JLabel("State:");
        stateField = new JTextField();
        JLabel zipCodeLabel = new JLabel("Zip Code:");
        zipCodeField = new JTextField();
        submitButton = new JButton("Submit");

        submitButton.addActionListener(this);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(mailIdLabel);
        panel.add(mailIdField);
        panel.add(phoneNumberLabel);
        panel.add(phoneNumberField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(stateLabel);
        panel.add(stateField);
        panel.add(zipCodeLabel);
        panel.add(zipCodeField);
        panel.add(new JLabel()); // Empty space for alignment
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String mailId = mailIdField.getText();
            String phoneNumber = phoneNumberField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());
            String city = cityField.getText();
            String state = stateField.getText();
            String zipCode = zipCodeField.getText();

            // Basic validation (you should add more validation logic)
            if (name.isEmpty() || mailId.isEmpty() || phoneNumber.isEmpty() ||
                username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() ||
                city.isEmpty() || state.isEmpty() || zipCode.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
            } else {
                // Registration successful
                JOptionPane.showMessageDialog(this, "Registration Successful!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistrationForm();
        });
    }
}
