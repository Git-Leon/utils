package com.github.git_leon.utils.string.stringutils;

import com.github.git_leon.utils.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/26/18.
 */
public class RepeatStringTest {
    @Test
    public void repeatAsteriskTest() {
        // Given
        Integer numberOfTimesToRepeat = 5;
        String valueToRepeat = "*";
        String expected = "*****";

        // When
        String actual = StringUtils.repeatString(valueToRepeat, numberOfTimesToRepeat);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void repeatPoundSignTest() {
        // Given
        Integer numberOfTimesToRepeat = 15;
        String valueToRepeat = "#";
        String expected = "###############";

        // When
        String actual = StringUtils.repeatString(valueToRepeat, numberOfTimesToRepeat);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
