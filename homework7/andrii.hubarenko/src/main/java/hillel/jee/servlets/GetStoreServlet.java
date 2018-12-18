package hillel.jee.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.Set;

public class GetStoreServlet extends MainServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mapPage(req, resp, "store.html", getContent(req));

    }

    private String getContent(HttpServletRequest req) {
        StringBuilder content = new StringBuilder();
        Set<String> authors = store.getListOfAuthors();

        for (String a : authors) {
            String authorsName = a.replaceAll("\\s+", "_");
            content.append("<li class=\"list-group-item\"><a href=\"" + req.getHeader("referer") + "list/" + authorsName + "\">");
            content.append(a);
            content.append("</a></li>");
        }
        return content.toString();
    }
}

