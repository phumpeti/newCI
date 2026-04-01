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
    String expected = "Rocky B";
    String actual = user.getUserName();

assertEquals(expected, actual);
}
@Test
    public void testGetPassWord() {
    User user = new User("Henric", "lösenord");
    String actual = user.getPassWord("lösenord2");
    String expected = "lösenord";
    // String actual = user.getPassWord();

        assertEquals(expected, actual);
    }

}
