import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FeedBack")
public class FeedBack extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Feedback Form</title>");
        out.print("</head>");

        out.print("<body>");
        out.print("<center>");

        out.print("<h2>Feedback Form</h2>");

        out.print("<form action='FeedBackLogic' method='post'>");

        out.print("Enter Your Name : ");
        out.print("<input type='text' name='username' required>");
        out.print("<br><br>");

        out.print("Rating (1 to 5) : ");
        out.print("<select name='rating' required>");
        out.print("<option value=''>Select</option>");
        out.print("<option value='1'>1</option>");
        out.print("<option value='2'>2</option>");
        out.print("<option value='3'>3</option>");
        out.print("<option value='4'>4</option>");
        out.print("<option value='5'>5</option>");
        out.print("</select>");
        out.print("<br><br>");

        out.print("Comments : ");
        out.print("<br>");
        out.print("<textarea name='comments' rows='4' cols='30' required></textarea>");
        out.print("<br><br>");

        out.print("<button type='submit'>Submit Feedback</button>");

        out.print("</form>");

        out.print("</center>");
        out.print("</body>");
        out.print("</html>");

    }
}
