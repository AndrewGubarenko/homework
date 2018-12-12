package hillel.jee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(value = "/readFile", loadOnStartup = 1)
public class ServletTwo extends HttpServlet {

    BufferedReader reader = new MyFileReader().getFileContent("D:\\Hillel\\Java Enterprise\\homework\\homework6\\andrii.hubarenko\\src\\main\\resources\\file.txt");
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Writer writer = response.getWriter();
        reader.lines().forEach(l -> {
            try {
                writer.write(l);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }
}
