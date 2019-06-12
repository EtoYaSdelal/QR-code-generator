package app;

import app.util.QRCodeGenerator;
import com.google.zxing.WriterException;

import java.io.IOException;

public class HotStart {
    public static void main(String[] args) {
        String randomName = QRCodeGenerator.getRandomName();
        try {
            QRCodeGenerator.generateQRCodeImage("what you want?", 350, 350, randomName);
        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }
    }
}
