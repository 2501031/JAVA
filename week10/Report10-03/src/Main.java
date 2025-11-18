import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hakbun = {"1601007", "1601003", "1601013", "1601024", "1601096",
                "1601058", "1601110", "1601077", "1601085", "1601026"};
        String[] name = {"이대한", "홍길동", "한나라", "이순신", "김혜숙",
                "김현호", "나희영", "이동국", "박예림", "김동근"};

        int[] mid = new int[10];
        int[] fin = new int[10];
        int[] quiz = new int[10];
        int[] assign = new int[10];
        int[] attend = new int[10];
        double[] weighted = new double[10];


        for (int i = 0; i < 10; i++) {
            System.out.printf("[%s %s] \n중간: ", hakbun[i], name[i]);
            mid[i] = sc.nextInt();
            System.out.printf("기말: ");
            fin[i] = sc.nextInt();
            System.out.printf("퀴즈: ");
            quiz[i] = sc.nextInt();
            System.out.printf("과제: ");
            assign[i] = sc.nextInt();
            System.out.printf("출석: ");
            attend[i] = sc.nextInt();

            weighted[i] = mid[i] * 0.15 + fin[i] * 0.15 + quiz[i] * 0.10 + assign[i] * 0.40 + attend[i] * 0.20;
            System.out.println();
        }

        for (int i = 0; i < weighted.length - 1; i++) {
            for (int j = i + 1; j < weighted.length; j++) {
                if (weighted[i] < weighted[j]) {

                    String tempStr = hakbun[i]; hakbun[i] = hakbun[j]; hakbun[j] = tempStr;
                    tempStr = name[i]; name[i] = name[j]; name[j] = tempStr;

                    int tempInt = mid[i]; mid[i] = mid[j]; mid[j] = tempInt;
                    tempInt = fin[i]; fin[i] = fin[j]; fin[j] = tempInt;
                    tempInt = quiz[i]; quiz[i] = quiz[j]; quiz[j] = tempInt;
                    tempInt = assign[i]; assign[i] = assign[j]; assign[j] = tempInt;
                    tempInt = attend[i]; attend[i] = attend[j]; attend[j] = tempInt;

                    double tempDouble = weighted[i]; weighted[i] = weighted[j]; weighted[j] = tempDouble;
                }
            }
        }


        System.out.println("*************************************************");
        System.out.println("학번     이름   중간 기말 퀴즈 과제 출석 점수");
        System.out.println("*************************************************");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s %4s %5d %4d %5d %5d %5d %7.2f\n",
                    hakbun[i], name[i], mid[i], fin[i], quiz[i], assign[i], attend[i], weighted[i]);
        }
        System.out.println("*************************************************");
    }
}