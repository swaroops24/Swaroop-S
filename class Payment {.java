class Payment {
    double calculateAmount(double amount) {
        return amount;
    }

    // Overloaded method
    double calculateAmount(double amount, double discountPercent) {
        return amount - (amount * discountPercent / 100);
    }
}

class CardPayment extends Payment {
    @Override
    double calculateAmount(double amount) {
        return amount + amount * 0.02; // 2% fee
    }
}

class UPIPayment extends Payment {
    @Override
    double calculateAmount(double amount) {
        return amount + amount * 0.01; // 1% fee
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CardPayment();
        System.out.println("Card total = " + p.calculateAmount(1000));

        p = new UPIPayment();
        System.out.println("UPI total = " + p.calculateAmount(1000));

        System.out.println("After discount = "
                + p.calculateAmount(1000, 10));
    }
}
