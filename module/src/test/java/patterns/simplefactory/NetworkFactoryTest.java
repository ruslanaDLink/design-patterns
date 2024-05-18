package patterns.simplefactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class NetworkFactoryTest {

    @Test
    void getSocialNetwork() throws URISyntaxException {
        //given
        NetworkFactory networkFactory = new NetworkFactory();

        //when
        SocialNetwork instagram = networkFactory.getSocialNetwork(Network.INSTAGRAM);

        //then
        Assertions.assertAll(
                ()-> assertNotNull(instagram),
                () -> assertNotNull(instagram.getName()),
                () -> assertNotNull(instagram.getLink()));
    }
}