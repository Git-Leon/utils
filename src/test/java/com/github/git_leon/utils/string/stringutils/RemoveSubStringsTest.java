package com.github.git_leon.utils.string.stringutils;

import com.github.git_leon.utils.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/26/18.
 */
public class RemoveSubStringsTest {
    @Test
    public void removeAlphabetFromQuickBrownFoxTest() {
        // Given
        String originalString = "The quick brown fox jumps over the lazy dog";
        String[] subStringsToRemove = {"The", "quick", "brown"};
        String expected = "   fox jumps over the lazy dog";

        // When
        String actual = StringUtils.removeSubstrings(originalString, subStringsToRemove);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeVowelsFromWhenWasTheLastTime() {
        // Given
        String originalString = "When was the last time?";
        String[] subStringsToRemove = {"When ", "was ", "Jump"};
        String expected = "the last time?";

        // When
        String actual = StringUtils.removeSubstrings(originalString, subStringsToRemove);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
