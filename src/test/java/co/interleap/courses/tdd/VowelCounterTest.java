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
}