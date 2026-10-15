import javax.swing.*;
import java.awt.*;
public class FeeReport extends JPanel {
    public FeeReport() {
        setLayout(new BorderLayout());
        String[] feeLines = {
            "Tuition,10000",
            "Library,500",
            "Laboratory,1000",
            "Sports,A"
        };
        StringBuilder output = new StringBuilder();
        output.append(String.format("%-15s %-10s%n", "Fee Type", "Amount"));
        output.append("--------------------------------\n");
        for (String line : feeLines) {
            try {
                String[] data = line.split(",");
                String feeType = data[0];
                int amount = Integer.parseInt(data[1]);
                output.append(
                    String.format("%-15s %-10d%n", feeType, amount)
                );
            } catch (NumberFormatException e) {
            }
        }
        output.append("\nTopper: Rahul");
        JTextArea textArea = new JTextArea(output.toString());
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
}
package com.scsvmv.fee;
import com.scsvmv.fee.report.FeeReport;
import javax.swing.*;
public class FeeApp {
   public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Fee Report");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new FeeReport());
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
