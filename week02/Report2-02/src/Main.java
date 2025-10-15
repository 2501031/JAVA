import java.awt.geom.Area;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radius = 0;
        double boxArea = 0;
        double circleArea = 0;
        double area = 0;

        System.out.print("원의 반지름 : ");
        radius = keyboard.nextInt();

        boxArea = (radius * 2) * (radius * 2);
        circleArea = radius * radius * Math.PI;
        area = boxArea - circleArea;

        System.out.printf("\n정사각형 면적 : %.0f Cm2\n", boxArea);
        System.out.printf("원의 면적 : %.2f Cm2\n", circleArea);
        System.out.printf("구하는 면적 : %.2f Cm2\n", area);
    }
}