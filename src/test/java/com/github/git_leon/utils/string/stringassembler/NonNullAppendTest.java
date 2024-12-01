package com.github.git_leon.utils.string.stringassembler;

import com.github.git_leon.utils.string.StringAssembler;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/26/18.
 */
public class NonNullAppendTest {
    @Test
    public void emptyNonNullAppendTest() {
        // Given
        StringAssembler sa = new StringAssembler();
        String valueToAppend = null;
        String expected = "";

        // When
        sa.nonNullAppend(valueToAppend);
        String actual = sa.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void helloWorldNonNullAppendTest() {
        // Given
        String expected = "Hello World";
        StringAssembler sa = new StringAssembler();
        String valueToAppend = null;


        // When
        String actual = sa
                .append(expected)
                .nonNullAppend(valueToAppend)
                .toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
