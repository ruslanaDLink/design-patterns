package patterns.behavioral.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

class StateTest {

    @Test
    public void test() throws MalformedURLException {
        //given
        String urlAddress = "https://www.pinterest.com/pin/844073155144492898/";

        Webpage webpage = new Webpage(new URL(urlAddress));

        //when
        StatusCode badRequest = webpage.badRequest();
        StatusCode notFound = webpage.notFound();
        StatusCode permittedAccess = webpage.permittedAccess();
        StatusCode loaded = webpage.loaded();
        StatusCode serverError = webpage.serverError();

        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(StatusCode.BAD_REQUEST_400, badRequest),
                () -> Assertions.assertEquals(StatusCode.NOT_FOUND_404, notFound),
                () -> Assertions.assertEquals(StatusCode.FORBIDDEN_403, permittedAccess),
                () -> Assertions.assertEquals(StatusCode.OK_200, loaded),
                () -> Assertions.assertEquals(StatusCode.INTERNAL_SERVER_ERROR_500, serverError)
        );
    }

}