import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.skypro.User;

public class UserTest {

    @Test
    @DisplayName("When User is created with login and email then there parameters are installed correct")
    public void createUser() {
        String login = "pavel";
        String email = "pavel@mail.ru";
        User user = new User(login, email);
        Assertions.assertEquals(login, user.getLogin());
        Assertions.assertEquals(email, user.getEmail());
    }

    @Test
    @DisplayName("When Users Constructor is empty , then login and email are null")
    public void createISEmpty() {
        User user = new User();
        Assertions.assertNull(user.getEmail());
        Assertions.assertNull(user.getLogin());
    }

    @Test
    @DisplayName("When email has @ and ' . ' Not at the end , then email is correct ")
    public void correctEmail() {
        String email = "pavel@.ru";
        Assertions.assertEquals("@","@");
        Assertions.assertEquals(".",".");
    }

    @Test
    @DisplayName("When login is not equals email , then parameters are correct")
    public void loginNotEqualsEmail() {
        String login = "pavel";
        String email = "pavel@.ru";
        Assertions.assertNotEquals(login, email);
    }
}
