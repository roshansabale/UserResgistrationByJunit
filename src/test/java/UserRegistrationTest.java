import com.Bridgelabz.UserRegistrationOperations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationOperations userRegistrationOperations =new UserRegistrationOperations();
    @Test
    void validateFirstName_WhenProper_ShouldReturnTrue() {
        String firstName="Roshan"; //Ros ros Roshan ROS
        boolean status=userRegistrationOperations.validateFirstNameOrLastName(firstName);
        Assert.assertTrue(status);
    }

    @Test
    void validateLastName_WhenProper_ShouldReturnTrue() {
        String lastName="Sabale";
        boolean status=userRegistrationOperations.validateFirstNameOrLastName(lastName);
        Assert.assertTrue(status);
    }

    @Test
    void validateEmail_WhenProper_ShouldReturnTrue() {
        String email="roshan.sabale@bl.co.in";
        boolean status=userRegistrationOperations.validateEmail(email);
        Assert.assertTrue(status);
    }

    @Test
    void validateMobileNumber_WhenProper_ShouldReturnTrue() {
        String mobileNUmber="91 9665412209";
        boolean status=userRegistrationOperations.validateMobileNumber(mobileNUmber);
        Assert.assertTrue(status);
    }

    @Test
    void validatePassword_WhenProperByRule_ShoulReturnTrue() {
        String password="74Rosa@hn@gh";
        boolean status=userRegistrationOperations.validatePassword(password);
        Assert.assertTrue(status);
    }
}
