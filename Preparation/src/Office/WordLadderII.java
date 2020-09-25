package Office;
import java.util.*;

public class WordLadderII {

	public static void main(String[] args) {
		
	}
	
	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList)
	{
		Set<String> set = new HashSet<>(wordList);
		Queue<String> q = new LinkedList<>();
		List<List<String>> res = new ArrayList<>();
		Map<String,List<String>> map = new HashMap<>();
		Map<String,Integer> distance = new HashMap<>();
		bfs(beginWord,endWord,set,q,map,distance);
		dfs(map,distance);
		return res;
	}
	
	public void bfs()
	{
		
	}

	public void dfs()
	{
		
	}
}
