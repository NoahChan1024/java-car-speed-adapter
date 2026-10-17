public class Main {

    public static void main(String[] args) {

        Car carA = new Adapter(
                new AmericanCar("Car A", 100));

        Car carB = new Car("Car B", 160);

        System.out.println(
                TestCarSpeed.compare(carA, carB));
    }
}