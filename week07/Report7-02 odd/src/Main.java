import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        final int PRICE = 10000;
        int time, age;
        char morning_discount;
        String age_discount;
        double discount;
        double result;

        System.out.print("영화 관람 시간(0~24) : ");
        time = keyboard.nextInt();
        System.out.print("나이 : ");
        age = keyboard.nextInt();

        if (age >= 8 && age <=18){
            age_discount = "청소년";
            discount = (time >=6 && time <= 10) ? 0.5 : 0.3;
        } else if (age >= 65) {
            age_discount = "경로자";
            discount = (time >=6 && time <= 10) ? 0.6 : 0.4;
        } else {
            age_discount = "일반";
            discount = 0.0;
        }
        morning_discount = (time >= 6 && time <= 10) ? 'o' : 'x';
        result = PRICE * (1 - discount);

        System.out.printf("조조할인 여부 : %c, %s, 총 금액(할인율 %.0f%%) : %,.0f원\n",
                morning_discount, age_discount, discount*100, result);
    }
}