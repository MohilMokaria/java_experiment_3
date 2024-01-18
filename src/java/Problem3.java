
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Problem3")
public class Problem3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the PrintWriter object to write HTML content
        PrintWriter pw = response.getWriter();

        // Set an integer header for Content-Type (Note: This is an invalid usage)
        response.setIntHeader("Content-Type", 123);
        // Set the correct Content-Type using setHeader
        response.setHeader("Content-Type", "text/html");

        // Generate HTML content
        pw.println("<html><head><title>Content by Header</title></head><body>");
        pw.println("<h1>Getting String Header</h1><p>Into Servlet where Content-Type = text/html</p>");
        pw.println("</body></html>");

        // Close the PrintWriter
        pw.close();
    }
}
