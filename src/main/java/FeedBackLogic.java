import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/FeedBackLogic")
public class FeedBackLogic extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String rating = req.getParameter("rating");

        if ("5".equals(rating))
        {
            req.setAttribute("rating", rating);
            RequestDispatcher rd = req.getRequestDispatcher("FeedBackOutput");
            rd.forward(req, resp);
        } else if ("4".equals(rating) || "3".equals(rating)) {

            req.setAttribute("rating", rating);
            RequestDispatcher rd = req.getRequestDispatcher("FeedBackOutput");
            rd.forward(req, resp);
        }
        else {
            req.setAttribute("rating", rating);
            RequestDispatcher rd = req.getRequestDispatcher("FeedBackOutput");
            rd.forward(req, resp);
        }
    }
}
