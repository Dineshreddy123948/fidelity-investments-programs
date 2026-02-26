import java.util.*;

public class MonthsLinkedList {
    public static void main(String[] args) {

        LinkedList<String> months = new LinkedList<>();

        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("April");
        months.add("November");

        months.addLast("December");

        months.addFirst("January");

        months.add(1, "March");
        months.add(1, "February");

        months.add(months.size() - 1, "September");
        months.add(months.size() - 1, "October");

        System.out.println("Original LinkedList:");
        System.out.println(months);

        List<String> correctOrder = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        LinkedList<String> ordered = new LinkedList<>();
        for (String m : correctOrder) {
            if (months.contains(m)) {
                ordered.add(m);
            }
        }

        System.out.println("\nMonths in proper order:");
        System.out.println(ordered);

        System.out.println("\nEven months:");
        for (int i = 1; i < ordered.size(); i += 2) {
            System.out.print(ordered.get(i) + " ");
        }

        System.out.println("\n\nOdd months:");
        for (int i = 0; i < ordered.size(); i += 2) {
            System.out.print(ordered.get(i) + " ");
        }

        System.out.println("\n\nUsing Iterator:");
        Iterator<String> it = ordered.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n\nFirst and Last month:");
        System.out.println(ordered.getFirst() + " & " + ordered.getLast());

        String birthdayMonth = "August";
        ordered.remove(birthdayMonth);
        System.out.println("\nAfter removing birthday month (" + birthdayMonth + "):");
        System.out.println(ordered);

        List<String> winter = Arrays.asList("December", "January", "February");
        boolean hasWinter = false;
        for (String m : winter) {
            if (ordered.contains(m)) {
                hasWinter = true;
                break;
            }
        }
        System.out.println("\nContains winter month? " + hasWinter);

        System.out.println("\nUsing peek:");
        System.out.println("First: " + ordered.peekFirst());
        System.out.println("Last: " + ordered.peekLast());

        ordered.pollFirst();
        ordered.pollLast();
        System.out.println("\nAfter poll (remove first & last):");
        System.out.println(ordered);
    }
}
