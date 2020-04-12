package Medium1000Onwards;

import java.util.*;

public class TheEarliestMomentWhenEveryoneBecomeFriends {
	public int earliestAcq(int[][] logs, int N) {
        UF uf= new UF(N);
        Arrays.sort(logs, (a, b)-> a[0]-b[0]);
        
        for(int [] log : logs){
            if(uf.find(log[1]) != uf.find(log[2])){
                uf.union(log[1], log[2]);   
            }
            
            if(uf.count == 1){
                return log[0];
            }
        }
        
        return -1;
    }
}

class UF{
    int [] parent;
    int [] size;
    int count;
    
    public UF(int n){
        this.parent = new int[n];
        this.size = new int[n];
        for(int i = 0; i<n; i++){
            parent[i] = i;
            size[i] = 1;
        }
        
        this.count = n;
    }
    
    public int find(int i){
        while(i != parent[i]){
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        
        return parent[i];
    }
    
    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if(size[i] > size[j]){
            parent[j] = i;
            size[i] += size[j];
        }else{
            parent[i] = j;
            size[j] += size[i];
        }
        
        this.count--;
    }
}