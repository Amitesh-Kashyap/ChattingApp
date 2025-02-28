package com.chat.demo.Utils;

import java.sql.Date;
import java.util.Scanner;

import com.chat.demo.Models.Client;
import com.chat.demo.Models.Message;
import com.chat.demo.Database.Data;

public class Menu
{

    public void showUserMenu(Scanner sc , Client ob)
    {
        System.out.println("1) Send Message\nElse) Exit");
        int ch = sc.nextInt();
        if(ch == 1)
        {
            System.out.print("Enter Chatroom ID : ");
            String chatroomId = sc.next();
            System.out.println("Enter Message");
            String msg = sc.nextLine();
            Data.MessageDB.add(new Message(ob.getClient_ID() , chatroomId , msg , new Date(0)));
            ob.getMessages().add(msg);
            ob.run();
        }
    }
    public void showMainMenu(Scanner sc)
    {
        System.out.println("1) New User\n2) Existing User\n3) Exit");
        int ch = sc.nextInt();
        if(ch == 1)
        {
            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            Client ob = new Client(name);
            System.out.println("Your ID is : " + ob.getClient_ID());
            showUserMenu(sc , ob);            
        }
        else if(ch == 2)
        {
            System.out.println("Working on it");
        }
        else
        {
            System.out.println("Exiting the application");
        }
    }
    
}
