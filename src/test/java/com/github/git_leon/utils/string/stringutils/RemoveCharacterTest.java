package com.github.git_leon.utils.string.stringutils;

import com.github.git_leon.utils.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/26/18.
 */
public class RemoveCharacterTest {
    @Test
    public void removeAlphabetFromQuickBrownFoxTest() {
        // Given
        String originalString = "The quick brown fox jumps over the lazy dog";
        String charactersToRemove = "abcdefghijklmnopqrstuvwxyz ";
        String expected = "T";

        // When
        String actual = StringUtils.removeCharacters(originalString, charactersToRemove);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeVowelsFromWhenWasTheLastTime() {
        // Given
        String originalString = "When was the last time?";
        String charactersToRemove = "aeiou ";
        String expected = "Whnwsthlsttm?";

        // When
        String actual = StringUtils.removeCharacters(originalString, charactersToRemove);

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void removeVowelsFromAlphabet() {
        // Given
        String originalString = "abcdefghijklmnopqrstuvwxyz";
        String charactersToRemove = "aeiou";
        String expected = "bcdfghjklmnpqrstvwxyz";

        // When
        String actual = StringUtils.removeCharacters(originalString, charactersToRemove);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
