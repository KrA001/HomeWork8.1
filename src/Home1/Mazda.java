package Home1;

public final class Mazda extends Cars {
    public Mazda(String model, int wheels, String engine, int maxSpeed, int privod, ColorCar colorCar) {
        super(model, wheels, engine, maxSpeed, privod, colorCar);
    }
    public void Mazda(Mazda mazda) {
        System.out.println("----------------------------------------");
        System.out.println("cars model: " + mazda.getModel());
        System.out.println("cars wheels: " + mazda.getWheels());
        System.out.println("cars engine: " + mazda.getEngine());
        System.out.println("cars maxSpeed: " + mazda.getMaxSpeed());
        System.out.println("cars privod: " + mazda.getPrivod());
        System.out.println("cars Color: " + mazda.getColorCar());
    }
    @Override
    public void cars(Cars cars) {
        System.out.println("Hello");
    }
}
