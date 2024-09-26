package chp08.ex8_2;

public class Drink {
    String name;
    int price;

    public Drink(){
    }

    public Drink(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %d", name, price);
    }
}
