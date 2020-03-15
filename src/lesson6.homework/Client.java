package lesson6.homework;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Client {
        public static void main(String[] args) throws IOException {
            final String SERVER_ADDR = "localhost";
            final int SERVER_PORT = 8188;
            Socket socket;
            DataInputStream in;
            DataOutputStream out;
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (true) {
                    String strFromServer = in.readUTF();
                    if (strFromServer.equalsIgnoreCase("/end")) {
                        break;
                    }
                    System.out.println(strFromServer);
                    //System.out.println("\n");
                }
            } catch (Exception e) {
                System.out.println("Connection has been closed!");
            }
        }).start();
        new Thread(() -> {
            while(true) {
                try {
                    out.writeUTF(getMessage("Enter message: "));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static String getMessage(String message) {
        String messageFromScanner;
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        messageFromScanner = sc.nextLine();
        return messageFromScanner;
    }






    }
