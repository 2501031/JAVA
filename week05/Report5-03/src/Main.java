public class Main {
    public static void main(String[] args) {
        int h, m, s;
        final int SECOND = 54321;

        h = SECOND / 3600;
        m = (SECOND % 3600) / 60;
        s = SECOND % 60;

        System.out.printf("%d 초 = %d 시간 %d 분 %d 초\n",
                SECOND,h,m,s);
    }
}
