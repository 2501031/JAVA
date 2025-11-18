import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        int[] score = new int[10];
        int total = 0;
        int max;
        int min;

        int i = 0;
        while (i < score.length) {
            System.out.printf("%d번째 점수 입력: ", i + 1);
            score[i] = keyboard.nextInt();
            if (score[i] >= 0 && score[i] <= 100)
                i++;
            else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        max = score[0];
        min = score[0];

        for (i = 0; i < score.length; i++) {
            total = total + score[i];
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }

        float average = total / 10.0f;

        System.out.println("합계: " + total);
        System.out.printf("평균: %.1f\n", average);
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}