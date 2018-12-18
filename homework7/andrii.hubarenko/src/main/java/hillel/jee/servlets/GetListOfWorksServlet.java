package hillel.jee.servlets;

import hillel.jee.bookstore.Application;
import hillel.jee.bookstore.BookStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

public class GetListOfWorksServlet extends MainServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mapPage(req, resp, "store.html", getContent(req));

    }

    private String getContent(HttpServletRequest req) {
        StringBuilder content = new StringBuilder();
        String authorName = req.getPathInfo().replaceFirst("/", "").replaceAll("_", " ");
        content.append(authorName);
        Set<String> authorsWorks = store.getListOfAuthorWorks(authorName);

        for(String w: authorsWorks) {
            content.append("<li class=\"list-group-item\">");
            content.append(w);
            content.append("</li>");
        }
        return content.toString();
    }
}
