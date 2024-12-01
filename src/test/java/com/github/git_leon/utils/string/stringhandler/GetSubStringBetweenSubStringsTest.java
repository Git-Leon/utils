package com.github.git_leon.utils.string.stringhandler;

import com.github.git_leon.utils.string.StringHandler;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/28/18.
 */
public class GetSubStringBetweenSubStringsTest {

    @Test
    public void testBetweenJOJOandBOBO() {
        test("JOJO", "BOBO", "The quick brown fox jumps over the lazy dog");
    }

    @Test
    public void testBetweenHtmlCommentTags() {
        test("<!--", "-->", "The quick brown fox jumps over the lazy dog");
    }


    @Test
    public void testBetweenGreaterThanPercentEqualsAndEqualsPercentLessThan() {
        test("<%=", "=%>", "The quick brown fox jumps over the lazy dog");
    }

    public void test(String prefix, String suffix, String body) {
        // Given
        String stringToBeHandled = prefix + body + suffix;
        StringHandler stringHandler = new StringHandler(stringToBeHandled);

        // When
        String actual = stringHandler.getSubStringsBetweenSubStrings(prefix, suffix);

        // Then
        Assert.assertEquals(body, actual);
    }
}
