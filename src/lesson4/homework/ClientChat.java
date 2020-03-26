package lesson4.homework;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientChat {

    private JPanel mainPanel;
    private JList<String> usersList;
    private JTextField messageTextField;
    private JButton sendButton;
    private JTextArea chatText;

    public ClientChat() {
        addListeners();
    }

    private void addListeners() {
//        sendButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                sendMessage();
//            }
//        });
        sendButton.addActionListener(e -> ClientChat.this.sendMessage());
        messageTextField.addActionListener(e -> sendMessage());
    }

    private void sendMessage() {
        String message = messageTextField.getText().trim();
        if (message.isEmpty()) {
            return;
        }

        appendOwnMessage(message);
        String selectedUser = usersList.getSelectedValue();
        if (selectedUser != null) {
            appendMessage(selectedUser, message);
        }
        messageTextField.setText(null);
    }

    private void appendMessage(String sender, String message) {
        String formattedMessage = String.format("%s: %s%n", sender, message);
        chatText.append(formattedMessage);
    }


    private void appendOwnMessage(String message) {
        appendMessage("Я", message);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Test Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new ClientChat().mainPanel);
        frame.setVisible(true);
    }

}
