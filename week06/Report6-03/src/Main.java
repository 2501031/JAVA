import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        String age_result;

        char card;
        int age_card;
        int age_money;

        int time;
        char night_result;

        int result;

        System.out.print("당신의 나이는 ? ");
        age = keyboard.nextInt();
        System.out.print("당신의 교통카드 여부는(o/x) ? ");
        card = keyboard.next().charAt(0);
        System.out.print("당신의 탑승 시간은(24시간 기준) ? ");
        time = keyboard.nextInt();

        age_result = age >= 19 ? "성인" : age >= 13 ? "청소년" : "어린이";
        age_card = age >= 19 ? 1250 : age >= 13 ? 750 : 450;
        age_money = age >= 19 ? 1350 : age >= 13 ? 850 : 450;

        night_result = (time >= 22) || (time <= 5) ? 'o' : 'x';

        result = (int) (night_result == 'o' ? 1.2 : 0) + (card == 'o' ? age_card : age_money);

        System.out.printf("%s 요금 + 교통카드 여부 %c + 심야 추가요금 %c\n",age_result,card,night_result);
        System.out.printf("총 요금 : %,d원 입니다.\n", result);
    }
}