import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char ch;
        char convert;
        char result;
        char result2;

        System.out.print("문자 입력 : ");
        ch = keyboard.next().charAt(0);

        result = (ch >= 'A' && ch <= 'Z') ? '대' : '소';
        result2 = (result == '대') ? '소' : '대';
        convert = (result == '대') ? (char)(ch + 32) : (char)(ch - 32);

        System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ?
                String.format("입력문자 %c는 %c문자이고, %c문자로 변경하면 %c 입니다.\n", ch, result, result2, convert) :
                String.format("영문자가 아닙니다."));
    }
}
