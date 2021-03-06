package Medium1000Onwards;
//1087
import java.util.*;

import Nonleetcode.Solution;

public class BraceExpansion {
	
	public static void main(String[] args) {	
		BraceExpansion h = new BraceExpansion();
		String[] inth =h.expand("{a,b}c{d,e}f");
		int b=0;
	}
	
	public String[] expand(String S) {
        if(S == null || S.length() == 0){
            return new String[0];
        }
        
        List<String> res = new ArrayList<String>();
        dfs(S, 0, new StringBuilder(), res);
        Collections.sort(res);
        return res.toArray(new String[0]);
    }
    
    private void dfs(String s, int i, StringBuilder sb, List<String> res){
        if(i >= s.length()){
            res.add(sb.toString());
            return;
        }
        
        
        if(s.charAt(i) == '{'){
            int j = i+1;
            while(j<s.length() && s.charAt(j)!='}'){
                j++;
            }
            
            String [] candidates = s.substring(i+1, j).split(",");
            for(String candidate : candidates){
                sb.append(candidate);
                dfs(s, j+1, sb, res);
                sb.deleteCharAt(sb.length()-1);
            }
        }else{
            sb.append(s.charAt(i));
            dfs(s, i+1, sb, res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
