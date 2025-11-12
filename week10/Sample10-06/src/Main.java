import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] hakbon = {"2501002", "2501004", "2501012", "2501022",
                "2501032", "2501042", "2501054", "2501062", "2501072", "2501082"};
        String[] name = {"홍길동","이재명","윤석열","경복대","오세훈",
                "강민성", "김시온", "이진우", "한장우", "니키타"};
        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int meth[] = new int[name.length];

        int[] sum = new int[name.length];
        float[] avg = new float[name.length];
        int[] rank = new int[name.length];
        boolean swapped = false;

        int i = 0;
        while (i < kor.length){
            System.out.printf("%s님의 국어 성적 입력 : ", name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("%s님의 영어 성적 입력 : ", name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("%s님의 수학 성적 입력 : ", name[i]);
            meth[i] = keyboard.nextInt();

            if ((kor[i] >= 0 && kor[i] <= 100) &&
                (eng[i] >= 0 && eng[i] <= 100) &&
                (meth[i] >= 0 && meth[i] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
            System.out.println();
        }

        /* for (i = 0; i < name.length; i++){
            sum[i] = kor[i] + eng[i] + meth[i];
        }
        for(i = 0; i < name.length - 1; i ++){
            swapped = false;

            for (int j = 0; j < name.length -1 - i;j++){
                if (sum[j] < sum[j+1]){
                    String text = hakbon[i];
                    hakbon[j] = hakbon[j +1];
                    hakbon[j +1] = text;

                    text = name[i];
                    name[j] = name[j +1];
                    name[j +1] = text;

                    int data = kor[i];
                    kor[j] = kor[j +1];
                    kor[j +1] = data;

                    data = eng[i];
                    eng[j] = eng[j +1];
                    eng[j +1] = data;

                    data = meth[i];
                    meth[j] = meth[j +1];
                    meth[j +1] = data;

                    data = sum[i];
                    sum[j] = sum[j +1];
                    sum[j +1] = data;

                    swapped = true;
                }
            }
            if (!swapped) break;
        } */

        for (i = 0; i < kor.length; i++)
            avg[i] = sum[i] / 3.0f;


        /* for (i = 0; i < kor.length; i++){
            rank[i] = i + 1;
        }

        for (i = 0; i < kor.length - 1; i++){
            if (sum[i] == sum[i+1])
                rank[i+1] = rank[i];
        }


        for (i = 0; i < name.length; i++){
            sum[i] = kor[i] + eng[i] + meth[i];
        }
        for(i = 0; i < name.length - 1; i ++){
            swapped = false;

            for (int j = 0; j < name.length -1 - i;j++){
                if (hakbon[j].compareTo(hakbon[j+1]) > 0){
                    String text = hakbon[i];
                    hakbon[j] = hakbon[j +1];
                    hakbon[j +1] = text;

                    text = name[i];
                    name[j] = name[j +1];
                    name[j +1] = text;

                    int data = kor[i];
                    kor[j] = kor[j +1];
                    kor[j +1] = data;

                    data = eng[i];
                    eng[j] = eng[j +1];
                    eng[j +1] = data;

                    data = meth[i];
                    meth[j] = meth[j +1];
                    meth[j +1] = data;

                    data = sum[i];
                    sum[j] = sum[j +1];
                    sum[j +1] = data;

                    data = rank[i];
                    rank[j] = rank[j +1];
                    rank[j +1] = data;

                    float temp = avg[i];
                    avg[j] = avg[j +1];
                    avg[j +1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) break;
        } */



        System.out.println("*********************************************");
        System.out.println("  학번  이름  국어  영어  수학  총점  평균  등수");
        System.out.println("*********************************************");
        for (i = 0; i < name.length; i++){
            System.out.printf("%7s %3s %3d %3d %3d %3d %5.1f %2d\n",
                    hakbon[i], name[i], kor[i], eng[i], meth[i], sum[i], avg[i], rank[i]);
        }
        System.out.println("*********************************************");

    }
}