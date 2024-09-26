package chp09.ex09_3;
import java.util.Random;


public class MainRandom {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.printf("임의의 정수값: %d\n", rand.nextInt());
        System.out.printf("0~9 사이의 임의의 정수값: %d\n", rand.nextInt(10));
        System.out.printf("1~10 임의의 정수값: %d\n", rand.nextInt(10)+1);
        System.out.printf("임의의 실수값: %s\n", rand.nextDouble());
        System.out.printf("0이상 100미만 임의의 실수값: %s\n", rand.nextDouble(100));
        System.out.printf("임의의 논리값: %b\n", rand.nextBoolean());
    }
}
