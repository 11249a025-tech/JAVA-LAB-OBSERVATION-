public class FeeReport {
    public void printTable() {
        String[] feeLines = {
            "Tuition,10000",
            "Library,500",
            "Laboratory,1000",
            "Sports,A"
        };
        System.out.println("+------------+------------+");
        System.out.println("| Fee Type   | Amount     |");
        System.out.println("+------------+------------+");

        for (String line : feeLines) {
            try {
                String[] data = line.split(",");
                String feeType = data[0];
                int amount = Integer.parseInt(data[1]);

                System.out.printf("| %-10s | %-10d |%n", feeType, amount);
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid line: " + line);
            }
        }
        System.out.println("+------------+------------+");
        String topper = "Rahul";
        System.out.println("Topper: " + topper);
    }
}
package com.scsvmv.fee;
import com.scsvmv.fee.report.FeeReport;
public class FeeApp {
    public static void main(String[] args) {
        new FeeReport().printTable();
    }
}
