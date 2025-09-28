import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int SIZEPRICE = 56000;
        long price;
        double size;

        System.out.print("평수를 입력하세요 : ");
        size = keyboard.nextDouble();

        price = (long) (size * SIZEPRICE);
        price = (price / 1000) * 1000;

        System.out.printf("%.1f평\n신도시 주택 가격 : %,d\n", size, price);
    }
}