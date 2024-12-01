package com.github.git_leon.utils.string.stringassembler;

import com.github.git_leon.utils.string.StringAssembler;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.MissingFormatArgumentException;

/**
 * @author leon on 5/26/18.
 */
public class AppendTest {
    @Test
    public void appendEmpty() {
        // Given
        StringAssembler sa = new StringAssembler();
        String expected = "";

        // When
        sa.append(expected);
        String actual = sa.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void appendHelloWorld() {
        // Given
        StringAssembler sa = new StringAssembler();
        String expected = "Hello World";

        // When
        sa.append(expected);
        String actual = sa.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IOException.class)
    public void methodThatThrowsExceptionTest() throws IOException {
        throw new IOException();
    }

    @Test
    public void appendWithFormattingHelloWorld() {
        // Given
        StringAssembler sa = new StringAssembler();
        String unformattedString = "Hello, %s!";
        String formatArgument = "World";
        String expected = String.format(unformattedString, formatArgument);

        // When
        sa.append(expected);
        String actual = sa.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test(expected = MissingFormatArgumentException.class)
    public void appendWithFormattingMissingFormatArgument() throws MissingFormatArgumentException {
        // Given
        StringAssembler sa = new StringAssembler();
        String unformattedString = "Hello, %s, %s!";
        String formatArgument = "World";
        String expected = String.format(unformattedString, formatArgument);

        // When
        sa.append(expected);
        String actual = sa.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
