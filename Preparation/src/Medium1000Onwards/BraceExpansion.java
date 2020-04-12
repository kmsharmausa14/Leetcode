package Medium1000Onwards;

import java.util.*;

public class BraceExpansion {
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
