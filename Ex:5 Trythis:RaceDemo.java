class Book {
    int seats = 1;

    void book() {
        if (seats > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            seats--;
            System.out.println(Thread.currentThread().getName()
                    + " booked a seat!");
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " could not book a seat.");
        }
    }
}

public class RaceDemo {
    public static void main(String[] args) throws InterruptedException {
        Book b = new Book();

        Thread t1 = new Thread(() -> b.book(), "User-1");
        Thread t2 = new Thread(() -> b.book(), "User-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Seats left = " + b.seats);
    }
}
