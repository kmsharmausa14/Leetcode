package Easy;
//408
public class ValidWordAbbreviation {
	public boolean validWordAbbreviation(String word, String abbr) {
        if (word.isEmpty()) {
            return abbr.isEmpty();
        }
 
        int pWord = 0;
        int pAbbr = 0;
 
        while (pWord < word.length() && pAbbr < abbr.length()) {
            if (!Character.isDigit(abbr.charAt(pAbbr))) {
                if (word.charAt(pWord) == abbr.charAt(pAbbr)) {
                    pWord++;
                    pAbbr++;
                } else {
                    return false;
                }
            } else {           
                // edge case: leading zero
                //
                if (abbr.charAt(pAbbr) == '0') {
                    return false;
                }
                 
                int num = 0;
                while (pAbbr < abbr.length() && Character.isDigit(abbr.charAt(pAbbr))) {
                    int digit = Character.getNumericValue(abbr.charAt(pAbbr));
                    num = num * 10 + digit;
                    pAbbr++;
                }
 
                pWord += num;
            }
        }
 
        return pWord == word.length() && pAbbr == abbr.length();
    }
}
