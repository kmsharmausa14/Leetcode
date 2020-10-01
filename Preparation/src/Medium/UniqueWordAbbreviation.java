package Medium;
//288
import java.util.*;

public class UniqueWordAbbreviation {

	Map<String,String> map;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void validWordAbbr(String[] dictionary) 
	{
		this.map = new HashMap<>();
		for(String word:dictionary)
		{
			String abbr = toAbbr(word);
			if(map.containsKey(abbr))
				map.put(abbr, "");
			else
				map.put(abbr,word);
		}
	}

	public String toAbbr(String s)
	{
		if(s==null ||s.length()<=2)
			return s;
		int len = s.length()-2;
		String result = s.charAt(0) + "" + len+s.charAt(s.length()-1);
		return result;
	}
	
	public boolean isUnique(String word)
	{
		String abbr = toAbbr(word);
		if(!map.containsKey(abbr) || map.get(abbr).equals(word))
			return true;
		else
			return false;
	}
}
