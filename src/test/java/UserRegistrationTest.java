import com.Bridgelabz.UserRegistrationOperations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void validateFirstName_IfProper_ShouldReturnTrue() {
        String firstName="ros"; //Ros ros Roshan ROS
        UserRegistrationOperations userRegistrationOperations =new UserRegistrationOperations();
        boolean status=userRegistrationOperations.validateFirstName(firstName);
        Assert.assertTrue(status);
    }
}
