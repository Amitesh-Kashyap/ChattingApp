package com.chat.demo.Models;

import java.util.ArrayList;

import com.chat.demo.Secrets.Generate;

import lombok.Data;

@Data
public class Server
{
    private String ID;
    private ArrayList<Client> clients;
    private ArrayList<String> messages;
    public Server()
    {
        ID = Generate.generate_ID();
    }

    public void addClient(Client ob)
    {
        clients.add(ob);
    }

    public void addMessage(String messageID)
    {
        messages.add(messageID);
    }


}
