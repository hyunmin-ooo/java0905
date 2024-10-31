package chp10.ex10_6;

import java.util.ArrayList;

public class AreaCalculator {
    public static void main(String[] args) {
        Square squ = new Square();
        squ.name = "정사각형";
        squ.setWidth(7);

        Triangle tri = new Triangle();
        tri.name = "삼각형";
        tri.setWidth(15);
        tri.setHeight(9);

        Circle cir = new Circle();
        cir.name = "원";
        cir.setR(15);

//        ArrayList<Shape> arrList = new ArrayList<Shape>();
//        arrList.add(squ);
//        arrList.add(tri);
//        arrList.add(cir);
//
//        viewShapes(arrList);
        Shape[] arr = {squ, tri, cir};
        viewShapes(arr);
    }

    public static void viewShapes(Shape[] arrayList){
        for(Shape shape : arrayList){
            System.out.printf("%s의 면적은 %.2f㎠입니다.\n", shape.name, shape.area());
        }
    }
}
