
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
        response.setHeader("Custom-String-Header", "This is a java EE project");
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.println("<html><head><title>String Header</title></head><body>");
        pw.println("<h1>Getting String Header</h1><p>Header Value : " + response.getHeader("Custom-String-Header") + "</p>");
        pw.close();
    }
}
