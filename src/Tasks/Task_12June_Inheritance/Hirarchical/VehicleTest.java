package Tasks.Task_12June_Inheritance.Hirarchical;

public class VehicleTest {
    public static void main(String[] args) {
        //car object
        Car suzuki = new Car();
        suzuki.startEngine();
        suzuki.driveCar();

        //bike obj
        Bike splender = new Bike();
        splender.startEngine();
        splender.rideBike();
    }

}
