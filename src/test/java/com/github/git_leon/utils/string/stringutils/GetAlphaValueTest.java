package com.github.git_leon.utils.string.stringutils;

import com.github.git_leon.utils.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/26/18.
 */
public class GetAlphaValueTest {
    @Test
    public void getAlphaValueOf1() {
        // Given
        Integer valueToConvert = 1;
        String expected = "a";

        // When
        String actual = StringUtils.getValue(valueToConvert);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAlphaValueOf2() {
        // Given
        Integer valueToConvert = 2;
        String expected = "b";

        // When
        String actual = StringUtils.getValue(valueToConvert);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAlphaValueOf26() {
        // Given
        Integer valueToConvert = 26;
        String expected = "z";

        // When
        String actual = StringUtils.getValue(valueToConvert);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAlphaValueOf25() {
        // Given
        Integer valueToConvert = 25;
        String expected = "y";

        // When
        String actual = StringUtils.getValue(valueToConvert);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getAlphaValueOf27() {
        // Given
        Integer valueToConvert = 27;
        String expected = "aa";

        // When
        String actual = StringUtils.getValue(valueToConvert);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAlphaValueOf28() {
        // Given
        Integer valueToConvert = 28;
        String expected = "ab";

        // When
        String actual = StringUtils.getValue(valueToConvert);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAlphaValueOf52() {
        // Given
        Integer valueToConvert = 52;
        String expected = "az";

        // When
        String actual = StringUtils.getValue(valueToConvert);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
