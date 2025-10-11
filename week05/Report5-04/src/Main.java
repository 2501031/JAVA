import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total;
        char membership;
        String result;

        System.out.print("총 구매 금액 : ");
        total = keyboard.nextInt();
        System.out.print("멤버쉽 가입 여부(y/n) : ");
        membership = keyboard.next().charAt(0);
        result = (total >= 50000) ? "가능" :
                 (membership == 'y' && total >= 30000) ?
                 "가능" : "불가능";

        System.out.printf("무료 배송 : %s", result);
    }
}
