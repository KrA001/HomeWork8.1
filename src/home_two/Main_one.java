package home_two;

public class Main_one {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("кок жар", "149 ул кок-джар, бишкек");
        Dog dog = new Dog("ларик", "авчарка", "кушать");
        Dog dog1 = new Dog("дари", "пидбуль", Color.WHITE, shelter);
        Dog dog2 = new Dog("шарик", "чихуа хуа", Color.BROWN, shelter, "приниси");

        // я закаминтриовал этот sout потому что тама нету команды "shelter"
        //  System.out.println(dog.getInfo());
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());
        dog.makeVoice("gab ", 2);
        dog1.makeVoice("Au ", 1, " взять ");
        dog2.makeVoice("ааауууу ", 3);
    }
}
