package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
	@Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }
}