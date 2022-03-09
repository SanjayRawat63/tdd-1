package co.interleap.courses.tdd;

public class VowelCounter {
	
	public int count(String s)
	{
		int vowel_count=0;
		for(int i=0;i<s.length();i++)
		{
			    char c =s.charAt(i);
			    if(isVowel(c))
		         vowel_count++;
		}
		return vowel_count;
	}
	
	
	public boolean isVowel(char c)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			return true;
		return false;
	}
}
