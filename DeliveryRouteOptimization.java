import java.util.*;

public class DeliveryRouteOptimization {

    static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int source) {

        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, INF);
        dist[source] = 0;

        for (int i = 0; i < n - 1; i++) {

            int u = -1;
            int min = INF;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && dist[j] < min) {
                    min = dist[j];
                    u = j;
                }
            }

            visited[u] = true;

            for (int v = 0; v < n; v++) {

                if (!visited[v] && graph[u][v] != 0 &&
                        dist[u] != INF &&
                        dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("Shortest delivery distance from source:");

        for (int i = 0; i < n; i++) {
            System.out.println("To location " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0, 4, 0, 0, 0, 0},
                {4, 0, 8, 0, 0, 0},
                {0, 8, 0, 7, 0, 4},
                {0, 0, 7, 0, 9, 14},
                {0, 0, 0, 9, 0, 10},
                {0, 0, 4, 14, 10, 0}
        };

        int source = 0;

        dijkstra(graph, source);
    }
}