package home_one;

import home_two.Color;

public class Cars extends Transport {
    private Color color;
    private Golf numberCar;

    public Cars(String model, int wheels, String engine, int maxSpeed, int privod, ColorCar colorCar, Golf numberCar) {
        super(model, wheels, engine, maxSpeed, privod, colorCar, numberCar);
        this.numberCar = numberCar;
    }


    public Color getColor() {
        return color;
    }

    public Golf getNumberCar() {
        return numberCar;
    }

    public void cars(Cars cars) {
        System.out.println("cars model: " + cars.getModel());
        System.out.println("cars wheels: " + cars.getWheels());
        System.out.println("cars engine: " + cars.getEngine());
        System.out.println("cars maxSpeed: " + cars.getMaxSpeed());
        System.out.println("cars privod: " + cars.getPrivod());
        System.out.println("cars Color: " + cars.getColorCar());
        System.out.println("cars Golf: " + cars.getNumberCar().getNumberCar());
    }

    public final void cars(Cars cars, Mazda mazda) {
        System.out.println("салам");
    }
}
