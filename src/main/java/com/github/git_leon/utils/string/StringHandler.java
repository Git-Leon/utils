package com.github.git_leon.utils.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 5/28/18.
 */
public class StringHandler {
    private final String stringToBeHandled;

    /**
     * @param stringToBeHandled the value of some string to be evaluated
     */
    public StringHandler(String stringToBeHandled) {
        this.stringToBeHandled = stringToBeHandled;
    }

    /**
     * @param subString1 first sub string to target
     * @param subString2 second sub string to target
     * @return the first substring to be found between a specified `subString1` and `subString2`
     */
    public String getSubStringsBetweenSubStrings(String subString1, String subString2) {
        return getSubStringBetweenSubStrings(subString1, subString2).get(0);
    }


    /**
     * @param subString1 first sub string to target
     * @param subString2 second sub string to target
     * @return a list of each substring to be found between a specified `subString1` and `subString2`
     */
    public List<String> getSubStringBetweenSubStrings(String subString1, String subString2) {
        Pattern pattern = Pattern.compile(subString1 + "(.*?)" + subString2);
        Matcher matcher = pattern.matcher(stringToBeHandled);
        List<String> stringList = new ArrayList<String>();
        while (matcher.find()) {
            stringList.add(matcher.group(1));
        }
        return stringList;
    }
}
