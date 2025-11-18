import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] ip = new int[5];
        int nogood = 0;
        int total = 0;
        int xdata;

        int i = 0;
        while (true) {
            System.out.printf("%d번 투표자 : ", i + 1);
            i++;
            xdata = keyboard.nextInt();
            if (xdata == 0)
                break;
            total++;

            if (xdata >= 1 && xdata <= 4)
                ip[xdata]++;
            else
                nogood++;
        }


        System.out.printf("1번 : %d표\n", ip[1]);
        System.out.printf("2번 : %d표\n", ip[2]);
        System.out.printf("3번 : %d표\n", ip[3]);
        System.out.printf("4번 : %d표\n", ip[4]);
        System.out.printf("무효표 : %d표\n", nogood);
        System.out.printf("총투표수 : %d표\n", total);
    }
}