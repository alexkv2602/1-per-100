public class Main {
    public static void main(String[] args) {
        int balance = 1000;
        int topUpBalance = 2000;
        int bonus = topUpBalance / 100;
        int resultBalance;
        if (topUpBalance > 1000) {
            resultBalance = balance + topUpBalance + bonus;
        } else {
            resultBalance = balance + topUpBalance;
        }
        System.out.println("Остаток на счете:" + resultBalance);
        System.out.println("Бонус:" + bonus);
    }
}