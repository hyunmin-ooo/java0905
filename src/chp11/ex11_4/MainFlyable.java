package chp11.ex11_4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {

        Bird b = new Bird();
        Helicopter h = new Helicopter();
        Rocket r = new Rocket();

        Flyable[] flyables = {b,h,r};

        for (Flyable flyable : flyables){
            flyable.fly();
        }

        ArrayList<Flyable> flyablesList = new ArrayList<>();
        flyablesList.add(b);
        flyablesList.add(h);
        flyablesList.add(r);

        for(Flyable flyable:flyablesList){
            flyable.fly();
        }
    }
}
