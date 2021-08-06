public class Main {
    public static void main(String[] args) {
        int Account = 2000;
        int TopUp = 1300;
        if (TopUp > 1000) {
            int Bonus = (TopUp) / 100;
            System.out.println(Account + TopUp + Bonus);
            System.out.println(Bonus);
        }
    }

}
