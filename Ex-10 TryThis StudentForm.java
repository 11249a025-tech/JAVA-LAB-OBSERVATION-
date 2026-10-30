import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class StudentForm extends JFrame implements ActionListener {
    JLabel title, nameLabel, regLabel, outputLabel;
    JTextField nameField, regField;
    JCheckBox hostelRequired;
    JButton submitButton, deleteButton;
    JTextArea outputArea;
    Connection con;
    StudentForm() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        title = new JLabel("STUDENT REGISTRATION FORM");
        nameLabel = new JLabel("Student Name:");
        regLabel = new JLabel("Registration Number:");
        nameField = new JTextField(20);
        regField = new JTextField(20);
        hostelRequired = new JCheckBox("Hostel Required");
        submitButton = new JButton("Submit");
        deleteButton = new JButton("Delete");
        outputLabel = new JLabel("Student Details:");
        outputArea = new JTextArea(6, 30);
        outputArea.setEditable(false);
        submitButton.addActionListener(this);
        deleteButton.addActionListener(this);
        add(title);
        add(nameLabel);
        add(nameField);
        add(regLabel);
        add(regField);
        add(hostelRequired);
        add(submitButton);
        add(deleteButton);
        add(outputLabel);
        add(outputArea);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String regNo = regField.getText();
            String hostel = hostelRequired.isSelected()
                    ? "Yes" : "No";
            outputArea.setText(
                "Student Name: " + name +
                "\nRegistration No: " + regNo +
                "\nHostel Required: " + hostel
            );
        }
        if (e.getSource() == deleteButton) {
            deleteStudent();
        }
    }
    void deleteStudent() {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "";
        String sql = "DELETE FROM student WHERE reg_no = ?";
        try {
            Connection con =
                DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(regField.getText()));
            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                    "Student deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this,
                    "Student record not found!");
            }
            ps.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                ex.getMessage());
        }
    }
    public static void main(String[] args) {
        new StudentForm();
    }
}
