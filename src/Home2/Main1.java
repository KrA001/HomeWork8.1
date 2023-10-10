package Home2;

public class Main1 {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("кок жар", "149 ул кок-джар, бишкек");
        Dog dog = new Dog("ларик", "авчарка", "кушать");
        Dog dog1 = new Dog("дари", "пидбуль", Color.WHITE, shelter);
        Dog dog2 = new Dog("шарик", "чихуа хуа", Color.BROWN,shelter,"приниси");

      //  System.out.println(dog.getInfo());
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());
        dog.makeVoice("gab",2);
        dog1.makeVoice("Au",0);
        dog2.makeVoice("ааауууу",3);
    }
}
