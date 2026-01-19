import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FeedBackOutput")
public class FeedBackOutput extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String rating = (String) req.getAttribute("rating");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if ("5".equals(rating))
        {
            out.print("<html>");
            out.print("<head><title>User Feedback Output</title></head>");
            out.print("<body>");
            out.print("<center>");

            out.print("<h2>Feedback Points</h2>");
            out.print("<h3>Welcome You Got : 1000 Points</h3>");

            out.print("</center>");
            out.print("</body>");
            out.print("</html>");
        } else if ("4".equals(rating) || "3".equals(rating)) {

            out.print("<html>");
            out.print("<head><title>User Feedback Output</title></head>");
            out.print("<body>");
            out.print("<center>");

            out.print("<h2>Feedback Points</h2>");
            out.print("<h3>Welcome You Got : 500 Points</h3>");

            out.print("</center>");
            out.print("</body>");
            out.print("</html>");

        }
        else {
            out.print("<html>");
            out.print("<head><title>User Feedback Output</title></head>");
            out.print("<body>");
            out.print("<center>");

            out.print("<h2>Feedback Points</h2>");
            out.print("<h3>Welcome You Got : 100 Points</h3>");

            out.print("</center>");
            out.print("</body>");
            out.print("</html>");
        }


    }
}
