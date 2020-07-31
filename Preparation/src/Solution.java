import java.util.*;


class Solution {
	
	public static void main(String[] args)
	{
		Solution s = new Solution();
		List<String> list = new ArrayList<>(Arrays.asList(new String[] {"cats", "and"}));
	
		List<String> a = s.wordBreak("catsanddog",list);
		String h = "";
	}
	
	Map<Integer,List<String>> map = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) 
    {
        Set<String> set = new HashSet<>();
        for(String w:wordDict)
            set.add(w);
        return word_Break(s,set,0);
    }

    public List<String> word_Break(String s,Set<String> wordDict,int start)
    {
        if(map.containsKey(start))
            return map.get(start);
        
        LinkedList<String> res = new LinkedList<>();
        if(start==s.length())
            res.add("");
        
        for(int end=start+1;end<=s.length();end++)
        {
            if(wordDict.contains(s.substring(start,end)))
            {
                List<String> list= word_Break(s,wordDict,end);
                for(String l:list)
                    res.add(s.substring(start,end)+(l.equals("")?"":" ")+l);
            }
        }
        map.put(start,res);
        return res;
    }
	
}