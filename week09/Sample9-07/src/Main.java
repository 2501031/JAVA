public class Main {
    public static void main(String[] args) {
        float degree;

        /*for (int i = 0; i <= 100; i+=10){   // 화씨온도
            degree = (5/9.0f) * (i-32);
            System.out.printf("화씨온도 : %3d \u2109, 섭씨온도 : %6.2f \u2103\n", i, degree);
        }*/

        int i = 0;
        do {
            degree = (5/9.0f) * (i-32);
            System.out.printf("화씨온도 : %3d \u2109, 섭씨온도 : %6.2f \u2103\n", i, degree);
            i += 10;
        } while (i<=100);
    }
}