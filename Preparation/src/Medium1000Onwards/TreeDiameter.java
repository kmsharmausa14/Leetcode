package Medium1000Onwards;

import java.util.ArrayList;

public class TreeDiameter {
int res = 0;
    
    public int treeDiameter(int[][] edges) {
        if(edges == null || edges.length == 0){
            return 0;
        }
        
        int n = edges.length + 1;
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<Integer>();
        }
        
        for(int [] e : edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        dfs(0, graph, -1);
        
        return res;
    }
    
    private int dfs(int root, ArrayList<Integer>[] graph, int parent){        
        int max1 = 0;
        int max2 = 0;
        for(int next : graph[root]){
            if(next != parent){
                int depth = dfs(next, graph, root);
                if(depth > max1){
                    max2 = max1;
                    max1 = depth;
                }else if(depth > max2){
                    max2 = depth;
                }
            }
        }
        
        res = Math.max(res, max1 + max2);
        return max1 + 1;
    }
}
