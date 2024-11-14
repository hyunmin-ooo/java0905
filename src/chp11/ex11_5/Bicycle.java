package chp11.ex11_5;

public class Bicycle implements Vehicle{

    @Override
    public void horn() {
        System.out.println("따르릉 따르릉");
    }
    static public void stop(String place){
        System.out.println(place + "에 자전거가 멈춘다.");
    }
}
