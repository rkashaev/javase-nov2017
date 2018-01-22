package lesson180122;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class IOStreamsExample {

    public static void main(String[] args) throws Exception {
        try (InputStream is = new FileInputStream("/Users/student/rkashaev/java fundamentals/video/jse-171127-2.mov");
             OutputStream os = new FileOutputStream("/Users/student/rkashaev/java fundamentals/video/copy-2.mov")) {

//            copyStream(is, os);
        }


        URL url = new URL("https://r5---sn-axq7sn7l.c.2mdn" +
                ".net/videoplayback/id/64e449638b25472d/itag/15/source/doubleclick/ratebypass/yes/mime/video%2Fmp4/acao/yes/ip/0.0.0.0/ipbits/0/expire/3641836577/sparams/acao,expire,id,ip,ipbits,itag,mime,mip,mm,mn,ms,mv,pl,ratebypass,source/signature/60EEEE9068CD9722D0EEFD27D51C5099037A1125.4BE37B6CA61F0C862FD30242625D115E75EFB785/key/cms1/cms_redirect/yes/mip/46.229.218.232/mm/42/mn/sn-axq7sn7l/ms/onc/mt/1516639877/mv/u/pl/24/file/file.mp4");
        URLConnection urlConnection = url.openConnection();
        try (InputStream is = urlConnection.getInputStream();
             OutputStream os = new FileOutputStream("/Users/student/rkashaev/java fundamentals/video/file.mp4")) {

            copyStream(is, os);
        }
    }

    public static void copyStream(InputStream input, OutputStream output) {
        long time = System.currentTimeMillis();
        try {
            byte[] buffer = new byte[4096];
            BufferedInputStream bis = new BufferedInputStream(input);
            BufferedOutputStream bos = new BufferedOutputStream(output);

            int len=0;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            bos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        time = System.currentTimeMillis() - time;
        System.out.printf("Copying completed by %d ms%n", time);
    }


}
