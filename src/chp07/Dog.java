package chp07;

public class Dog {
    private String name;
    private String breeds;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void wag(){
        System.out.println(name + "이가 살랑살랑 꼬리를 친다.");
    }

    public void bark(){
        System.out.println("멍멍!");
    }

    public void bark(int times, String sound){
        System.out.printf("%s이(가) %d번 %s짖는다.\n", name, times, sound);
    }

}
