package com.github.git_leon.utils.string;

/**
 * @author leon on 5/26/18.
 */
public class StringAssembler {
    private final StringBuilder sb;
    private final String delimitingValue;

    public StringAssembler() {
        this("");
    }

    public StringAssembler(String delimitingValue) {
        this.delimitingValue = delimitingValue;
        this.sb = new StringBuilder();
    }

    public StringAssembler append(Object s, Object... args) {
        sb.append(String.format(s.toString(), args) + delimitingValue);
        return this;
    }

    public StringAssembler nonNullAppend(Object s) {
        return conditionalAppend(s != null, s);
    }

    public StringAssembler conditionalAppend(boolean condition, Object s) {
        return condition ? append(s) : this;
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}