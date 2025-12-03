public class Main {
    public static void main(String[] args) {
        System.out.println(sumNumbers(1,3,5));
        System.out.println(sumNumbers(1,3,5,9,20,45));
        System.out.println(sumNumbers(1,3));
    }

    private static int sumNumbers(int... numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++)
            total += numbers[i];


        return total;
    }
}