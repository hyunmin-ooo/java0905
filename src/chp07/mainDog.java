package chp07;

public class mainDog {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.setName("레옹");
        d1.setBreeds("말티즈");
        d1.setAge(15);

        d2.setName("누렁");
        d2.setBreeds("백구");
        d2.setAge(8);

        System.out.printf("d1 => (name: %s, breeds: %s, age: %d)\n", d1.getName(),d1.getBreeds(),d1.getAge());
        System.out.printf("d2 => (name: %s, breeds: %s, age: %d)\n", d2.getName(),d2.getBreeds(),d2.getAge());

        d1.wag();
        d2.wag();

        d1.bark(5, "왈왈!");
        d2.bark(4, "멍멍!");
    }
}
