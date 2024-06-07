package patterns.structural.decorator.components;

import patterns.structural.decorator.additional.UtilClass;

//concrete component
public class SingleString implements ReleaseString {

    @Override
    public String getSingleWord(String word) {
        if(UtilClass.ensureSingleWord(word)){
            return word;
        }
        return null;
    }
}
