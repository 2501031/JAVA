import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dollar,half,quarter,dime,nickel,penny,cent;
        double total;

        System.out.print("달러 : ");
        dollar = keyboard.nextInt();
        System.out.print("하프 : ");
        half = keyboard.nextInt();
        System.out.print("쿼터 : ");
        quarter = keyboard.nextInt();
        System.out.print("다임 : ");
        dime = keyboard.nextInt();
        System.out.print("니켈 : ");
        nickel = keyboard.nextInt();
        System.out.print("페니 : ");
        penny = keyboard.nextInt();

        cent = (dollar * 100) + (half * 50) +
               (quarter * 25) + (dime * 10) +
               (nickel * 5) + penny;
        total = cent / 100.0;

        System.out.printf("\n총 cents : %d\n",cent);
        System.out.printf("총 금액 : %,.2f",total);
    }
}