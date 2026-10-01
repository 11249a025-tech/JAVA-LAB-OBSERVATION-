public class HighestBill {
    public static void main(String[] args) {
        String[] students = {"Ravi", "Sita", "Arun", "Priya"};
        double[] bills = {1200, 2500, 1800, 3000};

        int highestIndex = 0;

        for (int i = 1; i < bills.length; i++) {
            if (bills[i] > bills[highestIndex]) {
                highestIndex = i;
            }
        }

        System.out.println("Student with highest bill: " + students[highestIndex]);
        System.out.println("Highest bill: " + bills[highestIndex]);
    }
}
