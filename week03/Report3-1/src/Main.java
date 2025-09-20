import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.print("첫번째 숫자를 입력하세요 : ");
        num1 = keyboard.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        num2 = keyboard.nextInt();

        result = num1 + num2;

        System.out.printf("%d + %d = %d\n", num1, num2, result);
    }
}