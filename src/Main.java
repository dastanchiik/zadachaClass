import java.util.List;

public class Main {
    public static void main(String[] args) {
        Child son = new Child("Muha", 19);
        Child son1 = new Child("Richard", 17);
        Child son2 = new Child("Genri", 15);
        Child[] sons = {son, son1, son2};
        Parents parents = new Parents("Sergey and Marina", sons.length, List.of(sons));

        House house = new House(57, "Manas", parents);
        
        System.out.println(house);

    }
}