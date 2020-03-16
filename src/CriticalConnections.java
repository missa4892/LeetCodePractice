import java.util.*;

public class CriticalConnections {
        static int id = 0;
        public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

            List<List<Integer>> graph = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                graph.add(i, new ArrayList<>());
            }

            for (List<Integer> connection : connections) {
                graph.get(connection.get(0)).add(connection.get(1));
                graph.get(connection.get(1)).add(connection.get(0));
            }

            List<List<Integer>> result = new ArrayList<>();

            boolean[] visited = new boolean[n];
            int ids[] = new int[n];
            int[] lowestPossibleReach = new int[n];

            for(int i=0; i<n; i++){
                if(!visited[i]){
                    dfs(i, -1, graph, visited, lowestPossibleReach, ids, result);
                }
            }

            return result;
        }

    private static void dfs(Integer curr, Integer parent, List<List<Integer>> graph, boolean[] visited, int[] lowestPossibleReach, int[] ids, List<List<Integer>> result) {
        ids[curr] = lowestPossibleReach[curr] = id++;
        visited[curr] = true;
        for (Integer child : graph.get(curr)) {
            if (child.equals(parent)) {
                continue;
            }
            if (!visited[child]) {
                dfs(child, curr, graph, visited, lowestPossibleReach, ids, result);
                lowestPossibleReach[curr] = Math.min(lowestPossibleReach[curr], lowestPossibleReach[child]);

                if (lowestPossibleReach[child] == child) {
                    result.add(Arrays.asList(curr, child));
                }
            } else {
                lowestPossibleReach[curr] = Math.min(lowestPossibleReach[curr], ids[child]);

            }
        }

    }


}
