package ex11;

public class mainCylinder {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 4;
        c.height = 5;

        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getSurfaceArea());
    }
}
