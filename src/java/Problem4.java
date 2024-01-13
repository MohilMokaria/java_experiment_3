
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Problem4")
public class Problem4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            // Scenario 1: Using setIntHeader with a non-integer value
            response.setIntHeader("Content-Type", 123); // This should not throw an exception

            // Scenario 2: Using setIntHeader with a non-numeric value (should throw an exception)
            response.setIntHeader("Invalid-Header", Integer.parseInt("NotAnInteger"));

            // Scenario 3: Using setHeader with invalid header name or value (should not throw an exception)
            response.setHeader("Invalid-Header-Name", "text/plain");
            response.setHeader("Content-Type", "Invalid-Header-Value");

            // Writing some content to the response
            response.getWriter().println("No exceptions occurred!");

        } catch (NumberFormatException e) {
            // Handle NumberFormatException (e.g., when trying to parse a non-numeric value)
            response.getWriter().println("NumberFormatException occurred: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException (e.g., when using an invalid header name or value)
            response.getWriter().println("IllegalArgumentException occurred: " + e.getMessage());

        } catch (Exception e) {
            // Handle other exceptions
            response.getWriter().println("An unexpected exception occurred: " + e.getMessage());

        }
    }
}
