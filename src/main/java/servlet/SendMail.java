package servlet;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class SendMail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Recipient's email ID needs to be mentioned.
        String to = "rezviybelorus@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "web@gmail.com";

        // Assuming you are sending email from localhost
        String host = "localhost";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        // Set response content type
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("This is actual message");

            // Send message
            Transport.send(message);

            resp.setContentType("text/html");
            String title = "Send Email";
            String res = "Sent message successfully....";
            String docType =
                    "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

//            out.println(docType +
//                    "<html>\n" +
//                    "<head><title>" + title + "</title></head>\n" +
//                    "<body bgcolor = \"#f0f0f0\">\n" +
//                    "<h1 align = \"center\">" + title + "</h1>\n" +
//                    "<p align = \"center\">" + res + "</p>\n" +
//                    "</body> " +
//                    "</html>"
//         );

            out.println(res);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
