package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testFineCalculation() {
        // 1. Simulate User Input: Name, ID, 2 Books, 10 Days
        String input = "John Doe\n101\n2\n10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // 2. Capture Output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // 3. Run the Application's main method
        App.main(new String[]{}); 

        // 4. Verify Result
        String output = outputStream.toString();
        assertTrue(output.contains("Total Fine: $12"), "The fine should be $12.");
        assertTrue(output.contains("User: John Doe"), "User name should be displayed.");
    }
}
