import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3;
        int max = 0;
        int mid = 0;
        int min = 0;
        int casenum = 0;

        System.out.print("3개의 정수 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        if (num1 > num2 && num2 > num3){
            casenum = 1; // 1 2 3
        } else if (num1 > num3 && num3 > num2){
            casenum = 2; // 1 3 2
        } else if (num2 > num1 && num1 > num3){
            casenum = 3; // 2 1 3
        } else if (num2 > num3 && num3 > num1){
            casenum = 4; // 2 3 1
        } else if (num3 > num1 && num1 > num2){
            casenum = 5; // 3 1 2
        } else if (num3 > num2 && num2 > num1){
            casenum = 6; // 3 2 1
        }

        switch (casenum){
            case 1:
                max = num1;
                mid = num2;
                min = num3;
                break;
            case 2:
                max = num1;
                mid = num3;
                min = num2;
                break;
            case 3:
                max = num2;
                mid = num1;
                min = num3;
                break;
            case 4:
                max = num2;
                mid = num3;
                min = num1;
                break;
            case 5:
                max = num3;
                mid = num1;
                min = num2;
                break;
            case 6:
                max = num3;
                mid = num2;
                min = num1;
        }
        System.out.printf("입력 받은 %d, %d, %d를 크기 순으로 나열하면 %d, %d, %d 입니다\n",
                num1,num2,num3, max,mid,min);
    }
}