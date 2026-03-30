import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server waiting...");

            Socket s = ss.accept(); // accept client
            System.out.println("Client connected");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msg = dis.readUTF();

            System.out.println("Message from client: " + msg);

            ss.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}