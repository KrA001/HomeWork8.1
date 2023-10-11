package home_two;

public class Shelter {
    private String name;

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}