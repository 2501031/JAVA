import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String school = "";
        String name = "";
        int age = 20;
        char gender = ' ';
        float height = 0.0f;
        float weight = 0.0f;

        System.out.print("학교 : ");
        school = keyboard.nextLine();
        System.out.print("이름 : ");
        name = keyboard.nextLine();
        System.out.print("나이 : ");
        age = keyboard.nextInt();
        System.out.print("성별 : ");
        gender = keyboard.next().charAt(0);
        System.out.print("키 : ");
        height = keyboard.nextFloat();
        System.out.print("몸무게 : ");
        weight = keyboard.nextFloat();

        System.out.printf("*********************\n" +
                          "  학교 : %s\n" +
                          "  이름 : %s\n" +
                          "  나이 : %d\n" +
                          "  성별 : %s\n" +
                          "  신장 : %.1f Cm\n" +
                          "  체중 : %.1f Kg\n" +
                          "*********************",
                school, name, age, gender, height, weight);
    }
}