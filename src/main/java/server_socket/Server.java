package server_socket;


import com.sun.deploy.net.HttpUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

//todo: do not work
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true) {
            System.out.println("waiting for connection");
            Socket socket = serverSocket.accept();
            System.out.println("get one!");


            try (InputStream in = socket.getInputStream();
                 OutputStream outputStream = socket.getOutputStream()) {
                LocalDateTime date = LocalDateTime.now();
                byte[] bytes = date.toString().getBytes();
                outputStream.write(bytes);
            } finally {
                socket.close();
            }
        }
    }
}
