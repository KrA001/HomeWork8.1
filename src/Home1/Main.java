package Home1;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars(
                "буханка",
                4,
                "V12",
                200,
                2,
                ColorCar.BROWN

        );

        Mazda mazda = new Mazda(
                "Sedan626",
                4,
                "V8",
                220,
                4,
                ColorCar.BLACK
        );
        Mazda mazda2 = new Mazda(
                "хечпек625",
                4,
                "V6",
                190,
                4,
                ColorCar.WHITE
        );
        cars.cars(cars);
        mazda.Mazda(mazda);
        mazda2.Mazda(mazda2);

        mazda.cars(cars, mazda);
    }
}