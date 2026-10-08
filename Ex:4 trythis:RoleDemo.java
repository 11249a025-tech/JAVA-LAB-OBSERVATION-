class Staff {
    int basic = 15000;

    int salary() {
        return basic;
    }
}

class Driver extends Staff {
    int salary() {
        return basic + 3000;
    }
}

public class RoleDemo {
    public static void main(String[] args) {
        Driver d = new Driver();
        System.out.println("Driver Salary: Rs. " + d.salary());
    }
}
