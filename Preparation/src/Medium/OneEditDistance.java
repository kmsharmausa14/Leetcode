package Medium;
public class OneEditDistance {
//161
	public static void main(String[] args) {
		boolean r = isOneEditDistance("dmame","mame");
	}
	
	public static boolean isOneEditDistance(String s,String t)
	{
		if(s.equals(t))
			return false;
		return isOneInsert(s,t) || isOneReplace(s,t);
	}
	
	public static boolean isOneInsert(String s,String t)
	{
		if(Math.abs(s.length()-t.length())!=1)
			return false;
		
		boolean inserted=false;
		int i=0;
		int j=0;
		
		while(i<s.length() && j<t.length())
		{
			if(s.charAt(i)!=t.charAt(j))
			{
				if(inserted)
					return false;
				inserted=true;
				if(s.length()<t.length())
					j++;
				else 
					i++;
			}
			else
			{
				i++;
				j++;
			}
		}
		return true;
	}
	
	public static boolean isOneReplace(String s,String t)
	{
		if(s.length()!=t.length())
			return false;
		
		boolean replaced=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=t.charAt(i))
			{
				if(replaced)
					return false;
				replaced=true;
			}
		}
		return true;
	}

}
