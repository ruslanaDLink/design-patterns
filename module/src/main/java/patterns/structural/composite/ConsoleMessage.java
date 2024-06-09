package patterns.structural.composite;

import java.time.LocalTime;

//leaf
public class ConsoleMessage implements Message {
    @Override
    public void showMessage(String text) {
        System.out.println(LocalTime.now());
        System.out.println(text);
    }
}
