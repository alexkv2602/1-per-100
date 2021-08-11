public class Main {
    public static void main(String[] args) {
        int account = 2000;
        int topUp = 1300;
        if (topUp > 1000) {
            int bonus = (topUp) / 100;
            System.out.println(account + topUp + bonus);
            System.out.println(bonus);
        }
    }

}
