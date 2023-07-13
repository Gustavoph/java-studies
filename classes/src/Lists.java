import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();

        users.add("Gustavo");
        users.add("Giovanna");
        users.add(1, "Gabriel");
        users.add("Marcia");
        users.add("Alex");
        users.add("Bruno");
        users.add("Bianca");

        for (String user: users) {
            System.out.printf("User: %s%n", user);
        }

        System.out.printf("Size of list: %d%n", users.size());
        System.out.println("===============================");

        users.remove(1);
        users.remove("Alex");
        users.removeIf(x -> x.charAt(0) == 'M');


        for (String user: users) {
            System.out.printf("User: %s%n", user);
        }

        System.out.printf("Size of list: %d%n", users.size());
        System.out.println("===============================");

        System.out.printf("Index of Gustavo: %s%n", users.indexOf("Gustavo"));
        System.out.println("===============================");

        System.out.printf("Index of Beltrão: %s%n", users.indexOf("Beltrão"));
        System.out.println("===============================");

        List<String> selectedUsers = users.stream().filter(user -> user.charAt(0) == 'G').collect(Collectors.toList());

        for (String user: selectedUsers) {
            System.out.printf("Selected user: %s%n", user);
        }

        String name = users.stream().filter(user -> user.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println("===============================");
        System.out.printf("Find first: %s%n", name);
    }
}
