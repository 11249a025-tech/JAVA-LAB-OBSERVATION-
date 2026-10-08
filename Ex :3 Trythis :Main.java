class Payment {
    void pay() {
        System.out.println("Payment processing...");
    }
}

class NetBanking extends Payment {
    void pay() {
        System.out.println("NetBanking Payment: Rs. 12");
    }
}

public class Main {
    public static void main(String[] args) {
        NetBanking payment = new NetBanking(); 
        payment.pay();
    }
}
