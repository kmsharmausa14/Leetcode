package Medium;

public class NumberofConnectedComponentsinanUndirectedGraph {
	public int countComponents(int n, int[][] edges)
	{
		UnionFind uf = new UnionFind(n);
		int count = n;
		
	}
}

class UnionFind {
    private int[] parents;
    private int circleCount; 
    
    public UnionFind(int n) {
        parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
    }
    
    public int find(int x) {
        if (parents[x] == x) {
            return x;
        }
        
        return parents[x] = find(parents[x]);
    }
    
    public void union(int a, int b) {
        int groupA = find(a);
        int groupB = find(b);
        
        if (groupA != groupB) {
            parents[groupA] = groupB;
            circleCount--;
        }        
    }
    
    public void setCircleCount(int circleCount) {
        this.circleCount = circleCount;
    }
    
    public int getCircleCount() {
        return this.circleCount;    
    }    
}