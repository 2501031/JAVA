import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int L_PRICE = 1663;
        final float DISCOUNT = 0.07f;
        final float TAX = 1.1f;
        float l;
        int result1;
        float result2;
        float result3;

        System.out.print("주유할 리터 입력 : ");
        l = keyboard.nextFloat();

        result1 = (int) (l * L_PRICE);
        result2 = (float)result1 - (result1 * DISCOUNT);
        result3 = result2 * TAX;

        System.out.printf("%.1f리터 주유해서 %,d원 입니다.\n",l,result1);
        System.out.printf(result1 >= 50000 ? "5만원 이상이므로 7%%할인해서 %.1f원\n부가세 10%% 추가해서 총 %.1f원 입니다.\n" : "", result2,result3);
    }
}