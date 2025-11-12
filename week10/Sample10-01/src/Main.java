import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        // int[] java;
        // java new int[5];

        // int[] java = new int[5];

        int[] java = {95, 70, 80, 75, 100};
        float[] java1 = {95.0f, 70.0f, 80.0f, 75.0f, 100.0f};
        String[] name = {"홍길동","이재명","윤석열","경복대","오세훈"};

        int i = 0;
        while (i < name.length){
            System.out.printf("%s님의 JAVA 성적 입력 : ", name[i]);
            java[i] = keyboard.nextInt();

            if (java[i] >= 0 && java[i] <= 100){
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        for (i = 0; i < java.length; i++)
            System.out.printf("%s JAVA 성적 : %3d점\n", name[i], java[i]);
    }
}