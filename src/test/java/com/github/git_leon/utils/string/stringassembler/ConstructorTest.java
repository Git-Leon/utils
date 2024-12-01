package com.github.git_leon.utils.string.stringassembler;

import com.github.git_leon.utils.string.StringAssembler;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/26/18.
 */
public class ConstructorTest {
    @Test
    public void constructEmpty() {
        // Given
        String expected = "";

        // When
        StringAssembler sa = new StringAssembler(expected);
        String actual = sa.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void appendHelloWorldDelimitedByCommas() {
        // Given
        String delimitingValue = ",";
        String firstValueToAppend = "Hello";
        String secondValueToAppend = "World";
        StringAssembler sa = new StringAssembler(delimitingValue);
        String expected = firstValueToAppend + delimitingValue +
                secondValueToAppend + delimitingValue;

        // When
        sa
                .append(firstValueToAppend)
                .append(secondValueToAppend);

        // Then
        Assert.assertEquals(expected, sa.toString());
    }

    @Test
    public void appendQuickBrownFoxDelimitedByCommas() {
        // Given
        String delimitingValue = ",";
        String firstValueToAppend = "Quick";
        String secondValueToAppend = "Brown";
        String thirdValueToAppend = "Fox";
        StringAssembler sa = new StringAssembler(delimitingValue);
        String expected = firstValueToAppend + delimitingValue +
                secondValueToAppend + delimitingValue +
                thirdValueToAppend + delimitingValue;

        // When
        sa
                .append(firstValueToAppend)
                .append(secondValueToAppend)
                .append(thirdValueToAppend);

        // Then
        Assert.assertEquals(expected, sa.toString());
    }
}
