package home_one;

import home_two.Color;

public final class Mazda extends Cars {
    private Color color;
    private Golf numberCar;

    public Mazda(String model, int wheels, String engine, int maxSpeed, int privod, ColorCar colorCar, Golf numberCar) {
        super(model, wheels, engine, maxSpeed, privod, colorCar, numberCar);
        this.numberCar = numberCar;
    }


    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Golf getNumberCar() {
        return numberCar;
    }

    public void mazda(Mazda mazda) {
        System.out.println("----------------------------------------");
        System.out.println("cars model: " + mazda.getModel());
        System.out.println("cars wheels: " + mazda.getWheels());
        System.out.println("cars engine: " + mazda.getEngine());
        System.out.println("cars maxSpeed: " + mazda.getMaxSpeed());
        System.out.println("cars privod: " + mazda.getPrivod());
        System.out.println("cars Color: " + mazda.getColorCar());
        System.out.println("cars Golf: " + mazda.getNumberCar().getNumberCar());
    }

    @Override
    public void cars(Cars cars) {
        System.out.println("Hello");
    }
}
