package Easy;

import java.util.List;

public class SentenceSimilarity {

	public static void main(String[] args) {
		
	}
	
	public boolean isSentenceSimilarity(String[] words1, String[] words2, List<List<String>> pairs)
	{
		if(words1==null || words2==null)
			return words1==words2;
		
		if(words1.length!=words2.length)
			return false;
		
		for(int i=0;i<words1.length;i++)
		{
			String s1=words1[i];
			String s2=words2[i];
			if(s1.equals(s2))
				continue;
			if(same(s1,s2,pairs))
				continue;
			return false;
		}
		return true;
	}
	
	public boolean same(String s1,String s2, List<List<String>> pairs)
	{
		for(int i=0;i<pairs.size();i++)
		{
			List<String> list =pairs.get(i);
			if(list.contains(s1) && list.contains(s2))
				return true;
		}
		return false;
	}

}
