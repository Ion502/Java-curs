package collection;
import java.util.ArrayList;
import java.util.HashMap;

public class Colectie {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("tiger");
        System.out.println(animals);

        HashMap<String, String> capitalCity = new HashMap<String, String>();
        capitalCity.put("Brazilia", "Brasilia");
        capitalCity.put("Vietnam", "Hanoi");
        capitalCity.put("Japonia", "Tokyo");
        System.out.println(capitalCity.get("Japonia"));
    }
}