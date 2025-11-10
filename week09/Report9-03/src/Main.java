public class Main {
    public static void main(String[] args) {
        int wellDepth = 300;
        int climb = 55;
        int slip = 13;
        int position = 0;
        int day = 0;

        while (day < 7) {
            day++;
            position += climb;

            if (position >= wellDepth) {
                System.out.printf("달팽이는 %d 일째 낮에 우물을 탈출했습니다!\n", day);
                return;
            }

            position -= slip;
        }
    }
}