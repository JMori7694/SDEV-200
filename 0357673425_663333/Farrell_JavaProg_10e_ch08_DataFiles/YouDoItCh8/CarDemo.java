public class CarDemo {
    public static void main(String[] args) {
        Car firstCar = new Car(2021, Model.MINIVAN, Color.BLUE);
        Car secondCar = new Car (2024, Model.CONVERTABLE, Color.RED);
        firstCar.display();
        secondCar.display();
    }
}
