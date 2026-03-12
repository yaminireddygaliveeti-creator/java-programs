import java.util.*;

public class NetworkConnectionCheck {

    static void bfs(int start, List<List<Integer>> graph, boolean visited[]) {

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of computers (nodes): ");
        int n = sc.nextInt();

        System.out.print("Enter number of connections (edges): ");
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter connections (u v):");

        for (int i = 0; i < m; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u); // undirected network
        }

        boolean visited[] = new boolean[n];

        System.out.println("Network traversal using BFS:");
        bfs(0, graph, visited);

        boolean connected = true;

        for (boolean v : visited) {
            if (!v) {
                connected = false;
                break;
            }
        }

        if (connected)
            System.out.println("\nNetwork is fully connected.");
        else
            System.out.println("\nNetwork is NOT fully connected.");

        sc.close();
    }
}