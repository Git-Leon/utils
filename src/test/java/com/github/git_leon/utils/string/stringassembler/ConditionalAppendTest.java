package com.github.git_leon.utils.string.stringassembler;

import com.github.git_leon.utils.string.StringAssembler;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/26/18.
 */
public class ConditionalAppendTest {
    @Test
    public void falseConditionalAppendTest() {
        // Given
        StringAssembler sa = new StringAssembler();
        String valueToAppend = "Some value";
        String expected = "";

        // When
        sa.conditionalAppend(false, valueToAppend);
        String actual = sa.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trueConditionalAppendTest() {
        // Given
        StringAssembler sa = new StringAssembler();
        String expected = "Some value";

        // When
        sa.conditionalAppend(true, expected);
        String actual = sa.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

}