package co.interleap.courses.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;



public class VowelCounterTest {

    @Test
    public void shouldCountZeroWithAnEmptyString(){
    	assertEquals(0,new VowelCounter.count(""));
    }
}