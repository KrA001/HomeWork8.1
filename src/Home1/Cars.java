package Home1;

public class Cars extends Transport {
    public Cars(String model, int wheels, String engine, int maxSpeed, int privod, ColorCar colorCar) {
        super(model, wheels, engine, maxSpeed, privod, colorCar);
    }

    public void cars (Cars cars) {
        System.out.println("cars model: " + cars.getModel());
        System.out.println("cars wheels: " + cars.getWheels());
        System.out.println("cars engine: " + cars.getEngine());
        System.out.println("cars maxSpeed: " + cars.getMaxSpeed());
        System.out.println("cars privod: " + cars.getPrivod());
        System.out.println("cars Color: " + cars.getColorCar());
    }
    public final void cars (Cars cars,Mazda mazda){
    }
}
