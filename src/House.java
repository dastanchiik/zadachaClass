import java.util.List;

public class House {

    private int number;
    private String address;
    private Parents parents;

    public House(int number, String address, Parents parents) {
        this.number = number;
        this.address = address;
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", address='" + address + '\'' +
                ", parents=" + parents +
                '}';
    }
}
