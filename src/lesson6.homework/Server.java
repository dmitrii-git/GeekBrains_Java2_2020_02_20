package lesson6.homework;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {

    public static String getMessage(String message) {
        String messageFromScanner;
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        messageFromScanner = sc.nextLine();
        return messageFromScanner;
    }


    public static final String END_COMMAND = "/end";

    public static void main(String[] args) throws IOException {
        Socket clientSocket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8188);
            System.out.println("Server is running, waiting for connection ...");
            boolean flag = true;
            while (flag) {
                clientSocket = serverSocket.accept();
                System.out.println("Client connected");
                //System.out.println("Thread1");
                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                new Thread(() -> {
                    //System.out.println("Thread1");
                    while (true) {
                        String message = null;
                        try {
                            message = in.readUTF();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("From client: " + message);
                        if (message.equals(END_COMMAND)) {
                            break;
                        }
                    }
                }).start();
                new Thread(() -> {
                    while (true) {
                        try {
                            String messageOUT = getMessage("Enter message: ");
                            out.writeUTF("From server: " + messageOUT);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }

        } catch (IOException e) {
            e.printStackTrace();


    } finally

    {
        if (serverSocket != null) serverSocket.close();
        if (clientSocket != null) clientSocket.close();
    }


        }





}
