public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.modelName = "bicycle1";
        bicycle2.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;

        Car car = new Car();
        Car car2 = new Car();
        car.modelName = "car1";
        car2.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.modelName = "truck1";
        truck2.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        bicycle.service();
        car.service();
        truck.service();
        bicycle2.service();
        car2.service();
        truck2.service();
    }
}