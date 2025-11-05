public class Main {
    public static void main(String[] args) {
        int money = 0;
        int test = 0;

        for (int day = 1; true; day++) {
            test = (day == 1) ? 1 : test * 2;
            money += test;
            System.out.printf("%2d일(%,10d원) : %,12d원\n", day, test, money);
            if (money >= 100000000)
                break;
        }
    }
}