package patterns.structural.decorator.additional;

public class UtilClass {

    public static boolean ensureSingleWord(String str) {
        if (str != null) {
            String[] array = str.split(" ");
            if (array.length == 1) {
                return true;
            }
        }
        return false;
    }
}
