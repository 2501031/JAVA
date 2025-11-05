public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.printf("%2d I love you.\n", i);
        }
        int i = 1;
        while (i <= 10){    // i = 제어변수
            System.out.printf("%2d I love you.\n", i++);
        }

        int j = 1;
        do {
            System.out.printf("%2d I love you.\n", j++);
        } while (j <= 10);
    }
}