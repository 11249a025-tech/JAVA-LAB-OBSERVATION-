class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class DailyLimitException extends Exception {
    DailyLimitException(String msg) {
        super(msg);
    }
}

class Bank {
    int balance = 10000;
    int dailyLimit = 5000;
    int withdrawn = 0;

    void withdraw(int amount)
            throws InsufficientBalanceException,
                   InvalidAmountException,
                   DailyLimitException {

        if (amount <= 0)
            throw new InvalidAmountException("Invalid amount!");

        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance!");

        if (withdrawn + amount > dailyLimit)
            throw new DailyLimitException("Daily limit of Rs. 5000 exceeded!");

        balance -= amount;
        withdrawn += amount;

        System.out.println("Withdrawal successful: Rs. " + amount);
        System.out.println("Remaining balance: Rs. " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.withdraw(3000);
            b.withdraw(2500);
        } catch (InsufficientBalanceException |
                 InvalidAmountException |
                 DailyLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
