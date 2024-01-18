
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Problem2")
public class Problem2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set a custom string header in the response
        response.setHeader("Custom-String-Header", "This is a Java EE project");
        // Set the content type for the response
        response.setContentType("text/html");

        // Get the PrintWriter object to write HTML content
        PrintWriter pw = response.getWriter();

        // Generate HTML content
        pw.println("<html><head><title>String Header</title></head><body>");
        pw.println("<h1>Getting String Header</h1><p>Header Value : " + response.getHeader("Custom-String-Header") + "</p>");
        pw.println("</body></html>");

        // Close the PrintWriter
        pw.close();
    }
}
