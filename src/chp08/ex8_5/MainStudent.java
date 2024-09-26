package chp08.ex8_5;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(20240101, "유현주");
        Student s2 = new Student(20240101,"유현주");
        Student s3 = new Student(20240101,"유현주");

        System.out.printf("생선된 객체의 개수는 %d개입니다.", Student.count);
    }
}
