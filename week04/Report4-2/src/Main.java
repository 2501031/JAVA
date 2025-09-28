import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int amount;
        double result;
        double tax;

        System.out.print("판매 금액 입력 : ");
        amount = keyboard.nextInt();

        tax = amount * 0.1;
        result = amount - tax;

        System.out.printf("판매 금액 : %,d원\n", amount);
        System.out.printf("금액 : %,.0f원\n", result);
        System.out.printf("세금 : %,.0f원\n", tax);
    }
}