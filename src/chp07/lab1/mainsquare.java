package chp07.lab1;

public class mainsquare {

    public static void main(String[] args) {
        square s1 = new square();
        s1.setLength(15);
        int result = s1.area();

        System.out.printf("길이 %dcm인 정사각형의 면적은 %dcm입니다.\n", s1.getLength(), result);
    }

}
