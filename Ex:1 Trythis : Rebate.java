public class Rebate {
    public static void main(String[] args) {
        double amount = 1000;
        int days = 20;

        if (days < 26) {
            amount = amount - (amount * 0.10);
        }

        System.out.println("Final amount: " + amount);
    }
}
