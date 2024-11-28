package chp12.ex12_7;

public class MainThrows {
    public static void main(String[] args) {
        ThrowTest tt = new ThrowTest();
        try {
            tt.test1();
        } catch (MyAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
