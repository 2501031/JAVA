import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int temp;
        String result;

        System.out.print("현재 온도 입력 : ");
        temp = keyboard.nextInt();

        if (temp >= 35){
            result = "폭염 경보";
        } else if (temp >= 30) {
            result = "폭염 주의보";
        } else if (temp >= -10) {
            result = "정상 온도";
        } else {
            result = "한파 경보";
        }

        System.out.printf("%s, 현재 온도 : %d\n", result, temp);
    }
}