package hillel.jee.servlets;

import hillel.jee.bookstore.Application;
import hillel.jee.bookstore.BookStore;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.regex.Pattern;

public class MainServlet extends HttpServlet {

    protected static final String LEFT_QUOTES = Pattern.quote("{{");
    protected static final String RIGHT_QUOTES = Pattern.quote("}}");
    protected static final Pattern COMPILED_PATTERN_CONTENT = Pattern.compile(LEFT_QUOTES + "\\s+content\\s+" + RIGHT_QUOTES);

    protected static BookStore store = Application.store;

    private String getTemplate(HttpServletRequest req, String templateFile) throws IOException {
        byte[] bytes = req.getServletContext().getResourceAsStream(templateFile).readAllBytes();

        return new String(bytes);
    }

    protected void mapPage(HttpServletRequest req, HttpServletResponse resp, String templatePagePath, String content) throws IOException {
        String response = COMPILED_PATTERN_CONTENT.matcher(getTemplate(req, templatePagePath)).replaceAll(content);

        Writer writer = resp.getWriter();
        writer.write(response);
    }

}
