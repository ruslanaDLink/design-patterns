package patterns.structural.decorator.decorators;

import patterns.structural.decorator.components.ReleaseString;
import patterns.structural.decorator.components.SingleString;


public class ReversedString implements ReleaseString {
    private SingleString singleString;

    public ReversedString(SingleString singleString) {
        this.singleString = singleString;
    }

    @Override
    public String getSingleWord(String word) {
        String reversedString = "";
        String singleWord = singleString.getSingleWord(word);
        String[] arr = singleWord.split("");
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedString = reversedString.concat(arr[i]);
        }
        return reversedString;
    }

}
