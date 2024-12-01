package com.github.git_leon.utils.string.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class MatchGroup extends ArrayList<Match> {
    private final Matcher matcher;

    public MatchGroup(List<Match> matchList, Matcher matcher) {
        super(matchList);
        this.matcher = matcher;
        this.initializeMatchers();
    }

    public MatchGroup(Matcher matcher) {
        this(new ArrayList<>(), matcher);
    }

    public Matcher getMatcher() {
        return matcher;
    }

    @Override
    public String toString() {
        return new ArrayList<>(this).toString();
    }

    private void initializeMatchers() {
        for (int i = 0; matcher.find(); i++) {
            super.add(new MatchBuilder().setStartingIndex(matcher.start()).setEndingIndex(matcher.end()).setValue(matcher.group()).setMatchNumber(i).build());
        }
    }
}