package patterns.structural.decorator.decorators;

import patterns.structural.decorator.components.ReleaseString;
import patterns.structural.decorator.components.SingleString;

public class UpperCaseString implements ReleaseString {
    private SingleString singleString;

    public UpperCaseString(SingleString singleString) {
        this.singleString = singleString;
    }

    @Override
    public String getSingleWord(String word) {
        return singleString.getSingleWord(word).toUpperCase();
    }
}
