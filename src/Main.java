public class Main {
    public static void main(String[] args) {
        int balance = 1000;
        int topUpBalance = 700;
        int bonus = topUpBalance / 100;
        int resultBalance;
        if (topUpBalance > 1000) {
            resultBalance = balance + topUpBalance + bonus;
        } else {
            resultBalance = balance + topUpBalance;
        }
        System.out.println("Остаток на счете:" + resultBalance);
        int resultBonus;
        if (topUpBalance > 1000) {
            resultBonus = topUpBalance / 100;
        } else {
        resultBonus = 0;
        }
        System.out.println("Бонус:" + resultBonus);
    }
}