package co.interleap.courses.tdd;

public class VowelCounter {
	
	public int count(String s)
	{
		int vowel_count=0;
		for(int i=0;i<s.length();i++)
		{
			    if(isVowel(s.substring(i,i+1)))
		          vowel_count++;
		}
		return vowel_count;
	}
	
	
	public boolean isVowel(String c)
	{
		return "aeiouAEIOU".contains(c);
	}
}
