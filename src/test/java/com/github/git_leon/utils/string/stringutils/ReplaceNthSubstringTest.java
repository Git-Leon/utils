package com.github.git_leon.utils.string.stringutils;

import com.github.git_leon.utils.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReplaceNthSubstringTest {
    @Test
    public void test() {
        // Given
        String input = "]]]Hey thereHey there;Hey there[]'";
        String expected = "]]]Hey there;Hey there[]'";
        String stringToRemove = "Hey there";

        // when
        String actual = StringUtils.replaceNthSubstring(input, stringToRemove, 2);

        // then
        Assert.assertEquals(expected, actual);
    }
}
