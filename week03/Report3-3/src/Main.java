import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double ct = 0.0;
        double ft = 0.0;

        System.out.print("섭씨 온도 : ");
        ct =keyboard.nextDouble();

        ft = ct * 9 / 5 + 32;

        System.out.printf("화씨 온도 : %.1f",ft);
    }
}