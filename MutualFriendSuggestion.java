import java.util.*;

public class MutualFriendSuggestion {

    public static void findMutualFriends(Map<String, Set<String>> network, String user1, String user2) {

        Set<String> friends1 = network.get(user1);
        Set<String> friends2 = network.get(user2);

        Set<String> mutual = new HashSet<>(friends1);
        mutual.retainAll(friends2);

        if (mutual.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            System.out.println("Mutual friends: " + mutual);
        }
    }

    public static void main(String[] args) {

        Map<String, Set<String>> network = new HashMap<>();

        network.put("A", new HashSet<>(Arrays.asList("B","C","D")));
        network.put("B", new HashSet<>(Arrays.asList("A","C")));
        network.put("C", new HashSet<>(Arrays.asList("A","B","D","E")));
        network.put("D", new HashSet<>(Arrays.asList("A","C")));
        network.put("E", new HashSet<>(Arrays.asList("C")));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first user: ");
        String user1 = sc.next();

        System.out.print("Enter second user: ");
        String user2 = sc.next();

        findMutualFriends(network, user1, user2);

        sc.close();
    }
}