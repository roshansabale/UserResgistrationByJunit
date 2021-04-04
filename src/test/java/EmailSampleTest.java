import java.util.Arrays;
import java.util.Collection;

import com.Bridgelabz.UserRegistrationOperations;
import org.junit.Assert;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailSampleTest {
    private String emailAddress;
    private boolean expected;

    public EmailSampleTest(String emailAddress, boolean expected) {
        this.emailAddress = emailAddress;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> email() {
        return Arrays.asList(new Object[][] {
                { "abc@yahoo.com", true }, //0
                { "abc-100@yahoo.com", true }, //1
                { "abc.100@yahoo.com", true }, //2
                { "abc100@gmail.com", true }, //3
                {"abc11@abc.com", true}, //4
                {"abc-100@abc.net", true}, //5
                {"abc.100@abc.com.au", true}, //6
                {"abc@1.com", true}, //7
                {"abc@gmail.com.com",true}, //8
                {"abc+100@gmail.com",true}, //9
                {"abc@", false}, //10
                {"abc@.com.my", false}, //11
                {"abc123@gmail.a", false}, //12
                {"abc123@.com", false}, //13
                {"abc123@.com.com", false}, //14
                {".abc@abc.com", false}, //15
                {"abc()*@gmail.com", false}, //16
                {"abc..2002@gmail.com", false}, //17
                {"abc@abc@gmail.com", false}, //18  given true
                {"abc@gmail.com.1a", false}, //19
                {"abc@gmail.com..aa.au", false} //20
        });
    }

    @Test
    public void giveCheckSampleEmail() {
        UserRegistrationOperations userRegistrationOperations = new UserRegistrationOperations();
        Assert.assertEquals(expected, userRegistrationOperations.validateSampleEmail(emailAddress));
    }
}