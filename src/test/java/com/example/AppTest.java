import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testFineCalculation() {
        // 1. Simulate User Input: Name, ID, 2 Books, 10 Days (3 days late)
        // Late fine: 3 extra days * $2 * 2 books = $12
        String input = "John Doe\n101\n2\n10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // 2. Capture Output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // 3. Run the Program
        AppTest.main(new String[]{});

        // 4. Verify Result
        String output = outputStream.toString();
        assertTrue(output.contains("Total Fine: $12"), "The fine should be $12 for 3 late days and 2 books.");
        assertTrue(output.contains("User: John Doe"), "User name should be displayed correctly.");
    }
}
