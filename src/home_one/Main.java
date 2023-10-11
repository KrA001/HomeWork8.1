package home_one;

public class Main {
    public static void main(String[] args) {
        Golf golf = new Golf(23424);
        Cars cars = new Cars(
                "буханка",
                4,
                "V12",
                200,
                2,
                ColorCar.BROWN,
                golf
        );
        Mazda mazda = new Mazda(
                "Sedan626",
                4,
                "V8",
                220,
                4,
                ColorCar.BLACK,
                golf
        );
        Mazda mazda2 = new Mazda(
                "хечпек625",
                4,
                "V6",
                190,
                4,
                ColorCar.WHITE,
                golf
        );
        cars.cars(cars);
        mazda.mazda(mazda);
        mazda2.mazda(mazda2);
        mazda.cars(cars, mazda);
    }
}