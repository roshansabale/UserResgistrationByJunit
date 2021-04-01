import com.Bridgelabz.UserRegistrationOperations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationOperations userRegistrationOperations =new UserRegistrationOperations();
    @Test
    void validateFirstName_IfProper_ShouldReturnTrue() {
        String firstName="Roshan"; //Ros ros Roshan ROS
        boolean status=userRegistrationOperations.validateFirstName(firstName);
        Assert.assertTrue(status);
    }

    @Test
    void validateLastName_IfProper_ShouldReturnTrue() {
        String lastName="Sabale";
        boolean status=userRegistrationOperations.validateLastName(lastName);
        Assert.assertTrue(status);
    }
}
