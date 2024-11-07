package chp10.ex10_10;

public class Item {
    private String name;
    private int price;
    private int power;

    //필드명과 지역변수(매개변수)가 같을경우 this를 써서 구분해줌.

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Item(){
        this("칼",6000);
        System.out.println("기본 생성자가 호출됨");
    }
    public Item(String name, int price, int power){
        this.name = name;
        this.price = price;
        this.power = power;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
