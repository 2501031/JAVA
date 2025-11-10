public class Main {
    public static void main(String[] args) {
        int coin500 = 500;
        int coin100 = 100;

        int month = (coin500 * 10) + (coin100 * 10);
        int amount = month * 12 * 30;
        System.out.printf("30년 저금액 : %,d\n", amount);
    }
}