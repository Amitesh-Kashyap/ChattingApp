package com.chat.demo.Models;

import lombok.Data;
import java.util.ArrayList;

import com.chat.demo.Secrets.Generate;
import com.chat.demo.Utils.Inputs;

@Data
public class Client extends Thread
{
    private String Client_name;
    private String Client_ID;
    // private String receiver;
    private ArrayList<String> messages; // Collection of Message-IDs


    public Client(String Client_name)
    {
        this.Client_name = Client_name;
        Client_ID = Generate.generate_ID();
    }

    public void sendMessage(String messageID , Server server)
    {
        server.addMessage(messageID);        
    }
    
    @Override
    public void run()
    {
        // Functionality of Message sending
        // First check if the clent is authorized to enter the chatroom
        String password = Inputs.enterPassword();
        if(Inputs.isAuthorized(password))
        {
            Server server = new Server();
            server.addClient(this);
            // Add user to the chatroom
            System.out.println("You are added to the room.");
            // Search in all of the messages
            String messageID = messages.get(messages.size()-1);
            sendMessage(messageID , server);
        }
        // If authorized then send the message to the chatroom
    }


    
}
