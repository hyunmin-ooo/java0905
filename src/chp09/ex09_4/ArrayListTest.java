package chp09.ex09_4;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();

        names.add("Kim");
        names.add("Park");
        names.add("Lee");
        names.add("Jung");

        names.set(1,"Cha");
        String removed = names.remove(2);
        System.out.println("삭제된 요소:" + removed);

        for (int i = 0; i<names.size(); i++){
            System.out.printf("%s | ",names.get(i));
        }
    }
}