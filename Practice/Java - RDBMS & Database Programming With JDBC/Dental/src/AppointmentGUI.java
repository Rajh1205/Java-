import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppointmentGUI extends JFrame {

    private JTextField patientField;
    private JComboBox<String> serviceBox;
    private JButton bookButton;
    private JPanel mainPanel;

    // Professional Color Palette
    Color primaryBlue = new Color(0, 102, 204);
    Color lightBg = new Color(245, 247, 250);

    public AppointmentGUI() {
        setTitle("SmileCare | Modern Dental Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);
        setLocationRelativeTo(null); // Center on screen

        // Main Container with Padding
        mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(lightBg);
        mainPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Header
        JLabel header = new JLabel("Book New Appointment", SwingConstants.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 22));
        header.setForeground(primaryBlue);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        mainPanel.add(header, gbc);

        // Patient Input
        gbc.gridwidth = 1; gbc.gridy = 1;
        mainPanel.add(new JLabel("Patient Name:"), gbc);
        
        patientField = new JTextField(15);
        patientField.setPreferredSize(new Dimension(0, 30));
        gbc.gridx = 1;
        mainPanel.add(patientField, gbc);

        // Service Selection
        gbc.gridx = 0; gbc.gridy = 2;
        mainPanel.add(new JLabel("Service Type:"), gbc);

        String[] services = {"Cleaning", "Filling", "Root Canal", "Whitening", "Braces Checkup"};
        serviceBox = new JComboBox<>(services);
        serviceBox.setBackground(Color.WHITE);
        gbc.gridx = 1;
        mainPanel.add(serviceBox, gbc);

        // Action Button
        bookButton = new JButton("Confirm Booking");
        bookButton.setBackground(primaryBlue);
        bookButton.setForeground(Color.WHITE);
        bookButton.setFocusPainted(false);
        bookButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        bookButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        gbc.insets = new Insets(30, 10, 10, 10);
        mainPanel.add(bookButton, gbc);

        add(mainPanel);

        // Logic for Button
        bookButton.addActionListener(e -> {
            String name = patientField.getText();
            if(name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a patient name.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Success! Appointment for " + name + " is scheduled.", "Booking Confirmed", JOptionPane.INFORMATION_MESSAGE);
                patientField.setText("");
            }
        });

        setVisible(true);
    }
}