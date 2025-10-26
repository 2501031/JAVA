import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int kor, eng, math, avg;
        char credit;
        String result;

        System.out.print("국어, 영어, 수학 점수는 ? ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        avg = (kor + eng + math) / 3;

        if (avg >= 90){
            result = "성적 양호";
            credit = 'A';
        } else if (avg >= 80){
            result = "성적 양호";
            credit = 'B';
        } else if (avg >= 70) {
            result = "노력";
            credit = 'C';
        } else if (avg >= 60) {
            result = "노력";
            credit = 'D';
        } else {
            result = "성적 불량";
            credit = 'D';
        }

        System.out.println("===============================");
        System.out.println("국어 영어 수학 평균 학점 결 과");
        System.out.printf("%d, %d, %d, %d, %c, %s\n"
                , kor, eng, math, avg, credit, result);
        System.out.println("===============================");
    }
}