package com.github.git_leon.utils.string.stringutils;

import com.github.git_leon.utils.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReplaceLastSubString {
    @Test
    public void testReplaceLastString() {
        // Given
        String input = "]]]Hey thereHey there;Hey there[]'";
        String expected = "]]]Hey thereHey there;[]'";
        String stringToRemove = "Hey there";

        // when
        String actual = StringUtils.replaceLastSubString(input, stringToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }
}
