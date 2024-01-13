
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Problem5")
public class Problem5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Generate sizable content (e.g., HTML content)
        StringBuilder content = new StringBuilder("<html><body>");
        for (int i = 0; i < 10; i++) {
            content.append("<p>This is a line of content.</p>");
        }
        content.append("</body></html>");

        // Measure performance with setIntHeader
        long startTimeSetIntHeader = System.currentTimeMillis();
        try {
            response.setIntHeader("Content-Type", 123);
            response.getWriter().write(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTimeSetIntHeader = System.currentTimeMillis();
        long responseSizeSetIntHeader = response.getBufferSize();

        // Reset response to clear previous headers and content
        response.reset();

        // Measure performance with setHeader
        long startTimeSetHeader = System.currentTimeMillis();
        try {
            response.setHeader("Content-Type", "text/html");
            response.getWriter().write(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTimeSetHeader = System.currentTimeMillis();
        long responseSizeSetHeader = response.getBufferSize();

        // Compare and analyze the results
        long timeTakenSetIntHeader = endTimeSetIntHeader - startTimeSetIntHeader;
        long timeTakenSetHeader = endTimeSetHeader - startTimeSetHeader;

        System.out.println("Response Size (setIntHeader): " + responseSizeSetIntHeader + " bytes");
        System.out.println("Time Taken (setIntHeader): " + timeTakenSetIntHeader + " milliseconds");

        System.out.println("Response Size (setHeader): " + responseSizeSetHeader + " bytes");
        System.out.println("Time Taken (setHeader): " + timeTakenSetHeader + " milliseconds");

    }
}
