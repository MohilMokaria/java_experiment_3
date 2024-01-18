
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Problem1")
public class Problem1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set a custom integer header in the response
        response.setIntHeader("Custom-Integer-Header", 1);
        // Set the content type for the response
        response.setContentType("text/html");

        // Get the PrintWriter object to write HTML content
        PrintWriter pw = response.getWriter();

        // Generate HTML content
        pw.println("<html><head><title>Int Header</title></head><body>");
        pw.println("<h1>Getting Int Header</h1><p>Header Value : " + response.getHeader("Custom-Integer-Header") + "</p>");
        pw.println("</body></html>");

        // Close the PrintWriter
        pw.close();
    }
}
