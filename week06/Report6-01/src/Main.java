import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int TICKET_PRICE = 5000;
        int ticket;
        double discount;
        int result;

        System.out.print("식권 구매 개수를 입력하세요 : ");
        ticket = keyboard.nextInt();

        discount = ticket >= 30 ? 0.8 : ticket >= 20 ? 0.85 : ticket >= 10 ? 0.9 : 0;
        result = (int)(TICKET_PRICE * ticket * discount);

        System.out.printf("식권 구매 %d개 이상이므로 %.0f%% 할인해서 %,d원 입니다.\n",ticket,(1.0-discount)*100, result);
    }
}