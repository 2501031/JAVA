import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[][] employees = new String[10][3];
        float[] num2 = new float[employees.length];
        int[][] water = new int[employees.length][3];
        char num;
        int tempTax;

        int i = 0;
        while (i < employees.length){
            System.out.print("번호 입력 : ");
            employees[i][0] = keyboard.nextLine();
            System.out.print("이름 입력 : ");
            employees[i][1] = keyboard.nextLine();
            System.out.print("수도 구분 코드 입력 : ");
            num = keyboard.nextLine().charAt(0);
            switch (num){
                case '1' :
                    employees[i][2] = "가정용";
                    break;
                case '2' :
                    employees[i][2] = "영업용";
                    break;
                case '3' :
                    employees[i][2] = "공장용";
                    break;
                case '4' :
                    employees[i][2] = "관공서";
                    break;
                case '5' :
                    employees[i][2] = "군기관";
                    break;
            }
            System.out.print("사용량 입력 : ");
            num2[i] = keyboard.nextFloat();
            keyboard.nextLine();
            i++;
        }

        for (i = 0; i < employees.length; i++){
            int usage = Math.round(num2[i]);
            if (employees[i][2] == "가정용"){
                water[i][0] = usage * 40;
                tempTax = (int) ((1200+water[i][0]) * 0.05);
                water[i][1] = tempTax / 10 * 10;
            } else if (employees[i][2] == "영업용") {
                water[i][0] = usage * 55;
                tempTax = (int) ((1200+water[i][0]) * 0.035);
                water[i][1] = tempTax / 10 * 10;
            }
            else if (employees[i][2] == "공장용") {
                water[i][0] = usage * 78;
                tempTax = (int) ((1200+water[i][0]) * 0.025);
                water[i][1] = tempTax / 10 * 10;
            }
            else if (employees[i][2] == "관공서") {
                water[i][0] = usage * 35;
                tempTax = (int) ((1200+water[i][0]) * 0.015);
                water[i][1] =  tempTax / 10 * 10;
            }
            else if (employees[i][2] == "군기관") {
                water[i][0] = usage * 20;
                water[i][1] = 0;
            }

            water[i][2] = 1200 + water[i][0] + water[i][1];
        }

        System.out.println("-------------------------------------");
        System.out.println(" 번호  이름   구분  사용량 사용금액  TAX  납부액");
        System.out.println("-------------------------------------");
        for (i = 0; i < employees.length; i++){
            System.out.printf("%-6s %-6s %-6s %7.1f %,8d %,6d %,8d\n",
                    employees[i][0], employees[i][1], employees[i][2], num2[i],
                    water[i][0], water[i][1], water[i][2]);
        }
    }
}