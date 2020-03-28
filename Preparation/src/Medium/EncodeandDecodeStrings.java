package Medium;
import java.util.*;

public class EncodeandDecodeStrings {

	public static void main(String[] args) {
		
	}

	public String encode(List<String> strs)
	{
		if(strs==null || strs.size()==0)
			return null;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<strs.size();i++)
		{
			sb.append(strs.get(i).length() + "/" + strs.get(0));
		}
		return sb.toString();
	}
	
	public List<String> decode(String s)
	{
		List<String> ret = new ArrayList<>();
		if(s==null || s.length()==0)
			return ret;
		int i=0,slash=0;
		while(i<s.length())
		{
			slash=s.indexOf('/',i);
			int len = Integer.parseInt(s.substring(i,slash));
			ret.add(s.substring(slash+1,slash+1+len));
			i=slash+1+len;
		}
		return ret;
	}
}
