import java.util.*;

public class ArrayListAssignment {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Pineapple");
        list.add("Mango");

        list.add("Bangalore");
        list.add("Hyderabad");

        list.add("Singing");
        list.add("Cricket");

        System.out.println("Original List:");
        System.out.println(list);

        list.remove("Cricket");
        System.out.println("\nAfter removing hobby Cricket:");
        System.out.println(list);

        System.out.println("\nIs Cricket present? " + list.contains("Cricket"));

        list.remove("Hyderabad");
        list.remove("Apple");
        System.out.println("\nAfter removing one city and one fruit:");
        System.out.println(list);

        if(list.size() >= 6) {
            System.out.println("\n4th element: " + list.get(3));
            System.out.println("6th element: " + list.get(5));
        }

        int index = list.indexOf("Singing");
        if(index != -1) {
            list.set(index, "Dancing");
        }
        System.out.println("\nAfter replacing Singing with Dancing:");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("\nAfter reversing:");
        System.out.println(list);

        list.add(3, "Kerala");
        list.add(1, "Mango");

        System.out.println("\nAfter adding Kerala and Mango at positions:");
        System.out.println(list);

        System.out.println("\nLength of ArrayList: " + list.size());

        list.clear();
        System.out.println("\nAfter removing all elements:");
        System.out.println(list);
    }
}
