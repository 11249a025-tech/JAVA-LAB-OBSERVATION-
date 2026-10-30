
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {

    JLabel title, nameLabel, outputLabel;
    JTextField nameField;
    JCheckBox hostelRequired;
    JButton submitButton;
    JTextArea outputArea;

    StudentForm() {
        setTitle("Student Registration Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        title = new JLabel("STUDENT REGISTRATION FORM");
        nameLabel = new JLabel("Student Name:");

        nameField = new JTextField(20);

        hostelRequired = new JCheckBox("Hostel Required");

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        outputLabel = new JLabel("Output:");
        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);

        add(title);
        add(nameLabel);
        add(nameField);
        add(hostelRequired);
        add(submitButton);
        add(outputLabel);
        add(outputArea);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();

        String hostel = hostelRequired.isSelected()
                        ? "Yes" : "No";

        outputArea.setText(
            "Student Name: " + name +
            "\nHostel Required: " + hostel
        );
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
