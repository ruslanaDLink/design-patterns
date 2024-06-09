package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

//composite
public class DirectMessage implements Message {
    private List<Message> messages = new ArrayList<>();

    @Override
    public void showMessage(String text) {
        for (Message message : messages) {
            message.showMessage(text);
        }
    }
}
