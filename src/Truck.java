public class Truck extends Car{

    public Truck() {
        super();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
