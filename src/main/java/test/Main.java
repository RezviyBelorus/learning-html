package test;

import org.apache.commons.io.FileUtils;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileUtils.copyURLToFile();
        URL url = new URL("http://www.kocca.kr/insight/2017vol12/2017_3_vol12_1.pdf");


        String fileName = "/Users/alexfomin/Desktop/test/file";

        for (int i = 0; i < 50; i++) {
            File file = new File(fileName + i + ".pdf");

            URLConnection urlConnection = url.openConnection();
            try (FileOutputStream fos = new FileOutputStream(file)) {
                FileCopyUtils.copy(urlConnection.getInputStream(), fos);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
