package chp11.ex11_5;

public class MainVehicle {
    public static void main(String[] args) {

        Vehicle v = new Bicycle();

        v.horn();
        v.move("보광동","이태원");

        Bicycle bicycle = new Bicycle();
        bicycle.horn();
        bicycle.move("한강진역","이태원");
        Bicycle.stop("맥심프랜트");

        Vehicle vehicle = new Train();
        vehicle.horn();
        vehicle.move("여기서","여기");

        Vehicle.stop("폴리텍 대학");
    }
}
