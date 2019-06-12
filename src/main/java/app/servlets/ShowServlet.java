package app.servlets;

import app.util.QRCodeGenerator;
import com.google.zxing.WriterException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/view/show.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("text");
        String fileName = QRCodeGenerator.getRandomName();
        req.setAttribute("fileName", fileName);
        try {
            byte[] qrCodeImage = QRCodeGenerator.getQRCodeImage(text, 350, 350);
            req.setAttribute("img", qrCodeImage);
            ByteArrayInputStream bis = new ByteArrayInputStream(qrCodeImage);
            ServletOutputStream outputStream = resp.getOutputStream();
            outputStream.write(qrCodeImage);
            outputStream.println();
        } catch (WriterException e) {
            e.printStackTrace();
        }
        doGet(req, resp);
    }

}
