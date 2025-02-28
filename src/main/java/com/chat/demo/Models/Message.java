package com.chat.demo.Models;

import java.sql.Date;

import com.chat.demo.Secrets.Generate;

import lombok.Data;

@Data
public class Message
{
    private String messageID;
    private String senderID;
    private String receiverID;
    private String content;
    private Date timestamp;

    public Message(String senderID , String receiverID ,  String content , Date timestamp)
    {
        messageID = Generate.generate_ID();
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.content = content;
        this.timestamp = timestamp;
    }   
}
