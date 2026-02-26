import java.util.*;

public class hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> countries = new HashMap<>();

        countries.put(1, "India");
        countries.put(2, "USA");
        countries.put(3, "Canada");
        countries.put(4, "UK");
        countries.put(5, "Australia");
        countries.put(6, "Germany");
        countries.put(7, "France");
        countries.put(8, "Japan");
        countries.put(9, "China");
        countries.put(10, "Brazil");

        System.out.println("Country Keys: " + countries.keySet());
        System.out.println("Country Values: " + countries.values());

        System.out.println("Is India present? " + countries.containsValue("India"));
        System.out.println("Is key 45 present? " + countries.containsKey(45));

        countries.remove(10);
        System.out.println("After removing key 10: " + countries);

        HashMap<Integer, String> states = new HashMap<>();
        states.put(101, "Karnataka");
        states.put(102, "Tamil Nadu");
        states.put(103, "Kerala");
        states.put(104, "Andhra Pradesh");
        states.put(105, "Telangana");

        countries.putAll(states);
        System.out.println("After merging states: " + countries);

        countries.remove(5);
        System.out.println("After deleting key 5: " + countries);

        System.out.println("Is map empty? " + countries.isEmpty());

        TreeMap<Integer, String> sortedMap = new TreeMap<>(countries);
        System.out.println("Sorted Map: " + sortedMap);

        countries.clear();
        System.out.println("After clearing map: " + countries);
    }
}
