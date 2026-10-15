package com.scsvmv.fee.report;
public class FeeReport {
    public void printTable() {
        System.out.println("+------------+------------+");
        System.out.println("| Fee Type   | Amount     |");
        System.out.println("+------------+------------+");
        System.out.println("| Tuition    | 10000      |");
        System.out.println("| Library    | 500        |");
        System.out.println("| Laboratory | 1000       |");
        System.out.println("+------------+------------+");
    }
}
package com.scsvmv.fee;

import com.scsvmv.fee.report.FeeReport;

public class FeeApp {

    public static void main(String[] args) {
        new FeeReport().printTable();
    }
}
