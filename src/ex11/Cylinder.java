package ex11;

public class Cylinder {

    int radius;

    int height;

    double getVolume(){
        return radius * radius * Math.PI * height;
    }

    double getSurfaceArea(){
        double circleArea = Math.PI * radius * radius;
        double rectagleArea = 2 * Math.PI * radius * height;

        return 2 * circleArea + rectagleArea;
    }
}
