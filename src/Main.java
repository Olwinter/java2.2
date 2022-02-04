public class Main {
    public static void main(String[] args) {
        int actualBalance = 100;
        int payment = 1200;
        int newBalance;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
            newBalance = actualBalance + payment + bonus;
        } else {
            newBalance = actualBalance + payment;
        }
        System.out.println((newBalance) + " - текущий счет");
    }

}

