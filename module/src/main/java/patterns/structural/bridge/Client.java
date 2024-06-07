package patterns.structural.bridge;

import patterns.structural.bridge.implementation.LinkedHashMap;
import patterns.structural.bridge.implementation.Vector;

public class Client {
    public static void main(String[] args) throws Exception {
        LinkedHashMap<String> programingLanguagesList = new LinkedHashMap<>(new Vector<>(10));
        programingLanguagesList.add("Java");
        programingLanguagesList.add("Python");
        programingLanguagesList.add("JavaScript");
        programingLanguagesList.add("C++");
        programingLanguagesList.add("Ruby");
        programingLanguagesList.add("PHP");
        programingLanguagesList.add("Perl");
        programingLanguagesList.add("TypeScript");
        programingLanguagesList.add("HTML");
        programingLanguagesList.add("CSS");
        programingLanguagesList.add("C#");
        programingLanguagesList.add("Go");

       programingLanguagesList.printList();
    }
}
