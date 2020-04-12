package Medium1000Onwards;

public class ShortestWaytoFormString {
	public int shortestWay(String source, String target) {
        if(source == null || target == null){
            return -1;
        }
        
        if(target.length() == 0){
            return 0;
        }
        
        int res = 0;
        int m = source.length();
        int n = target.length();
        int cur = 0;
        while(cur < n){
            int temp = cur;
            for(int i = 0; i < m && cur < n; i++){
                if(source.charAt(i) == target.charAt(cur)){
                    cur++;
                }
            }
            
            if(temp == cur){
                return -1;
            }
            
            res++;
        }
        
        return res;
    }
}
