package co.interleap.courses.tdd;

public class VowelCounter {
	public int count(String s)
	{
		int vowel_count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		         vowel_count++;
		}
		return vowel_count;
	}
}
