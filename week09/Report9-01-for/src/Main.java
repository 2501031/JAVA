public class Main {
    public static void main(String[] args) {
        for (int chicken = 0; chicken <= 37; chicken++){
            int dog = 37 - chicken;
            int legs = chicken * 2 + dog * 4;
            if (legs==102){
                System.out.printf("닭 : %d마리, 개 : %d마리\n", chicken, dog);
                break;
            }
        }
    }
}