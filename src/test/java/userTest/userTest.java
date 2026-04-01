package userTest;

import org.junit.jupiter.api.Test;
import user.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class userTest {

@Test
    public void testUser() {

    User user = new User("nisse", "olle");
}
@Test
    public void testSetUserName() {
    User user = new User("Henric", "lösenord");
    user.setUserName("Rocky B");
    String expected = "Henric";
    String actual = user.getUserName();

assertEquals(expected, actual);
}
}
