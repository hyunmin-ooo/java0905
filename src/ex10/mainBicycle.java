package ex10;

public class mainBicycle {
    String name;
    double weight;
    int price;

    public static void main(String[] args){
        mainBicycle b1 = new mainBicycle();

        b1.name = "따릉이";
        b1.weight = 7.25;
        b1.price = 326000;
        System.out.printf("b1=>{%s, %.2f,%d}\n",b1.name,b1.weight,b1.price);
    }
}
