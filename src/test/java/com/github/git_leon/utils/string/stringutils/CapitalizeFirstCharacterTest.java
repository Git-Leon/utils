package com.github.git_leon.utils.string.stringutils;

import com.github.git_leon.utils.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/26/18.
 */
public class CapitalizeFirstCharacterTest {
    @Test
    public void capitalizeFirstCharacterOfHello() {
        // Given
        String hello = "hello";
        String expected = "Hello";

        // When
        String actual = StringUtils.capitalizeFirstChar(hello);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void capitalizeFirstCharacterOfWorld() {
        // Given
        String hello = "world";
        String expected = "World";

        // When
        String actual = StringUtils.capitalizeFirstChar(hello);

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void capitalizeFirstCharacterOfQuick() {
        // Given
        String hello = "quick";
        String expected = "Quick";

        // When
        String actual = StringUtils.capitalizeFirstChar(hello);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
