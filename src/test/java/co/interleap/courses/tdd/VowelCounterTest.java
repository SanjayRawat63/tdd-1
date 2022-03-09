package co.interleap.courses.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class VowelCounterTest {

    @Test
    public void shouldCountZeroWithAnEmptyString(){
    	assertEquals(0,new VowelCounter().count(""));
    }
    @Test
    public void shoudCountSingleVowelInString()
    {
    	assertEquals(1,new VowelCounter().count("a"));
    }
    @Test
    public void shouldCountAllVowelsInStringHavingOnlyVowels()
    {
    	assertEquals(5,new VowelCounter().count("aeiou"));
    }
    @Test 
    public void shouldCountVowelsInStringHavingOnlyOneConsonants()
    {
    	assertEquals(0,new VowelCounter().count("c"));
    }
    @Test 
    public void shouldCountVowelsInStringHavingOnlyConsonants()
    {
    	assertEquals(0,new VowelCounter().count("cbdgf"));
    }
    @Test
    public void shouldCountVowelsInStringHavingVowelsAndConsonants()
    {
    	assertEquals(5,new VowelCounter().count("hello learner"));
    }
    @Test 
    public void shouldCountVowelsInStringHavingBothUpperAndLowerCaseCharacters()
    {
    	assertEquals(11,new VowelCounter().count("A Quick broWN FOX JUmped over LAZY DOG."));
    }
}