
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
        response.setIntHeader("Custom-Integer-Header", 1);
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.println("<html><head><title>Int Header</title></head><body>");
        pw.println("<h1>Getting Int Header</h1><p>Header Value : " + response.getHeader("Custom-Integer-Header") + "</p>");
        pw.close();
    }
}
