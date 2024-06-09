package patterns.structural.composite;

import org.junit.jupiter.api.Test;


class DirectMessageTest {

    @Test
    void showMessage() {
        DirectMessage directMessage = new DirectMessage();
        directMessage.showMessage("testing method from composite's package");
    }
}