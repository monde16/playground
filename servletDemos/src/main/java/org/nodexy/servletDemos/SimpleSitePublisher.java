package org.nodexy.servletDemos;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by phoenix on 12/01/17.
 */
public class SimpleSitePublisher extends HttpServlet {
    private static String htmlContent = null;
    private byte[] bytes;
    private File file;
    public SimpleSitePublisher() throws URISyntaxException, IOException {
        file = new File(new URI("file:///home/phoenix/code/learn/jquery/getting-started/index.html"));
        bytes = new byte[(int) file.length()];
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        IOUtils.write(htmlContent,resp.getOutputStream());
        IOUtils.read(new FileInputStream(file), bytes);
    }
}
