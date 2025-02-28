package com.chat.demo.Service;

import java.util.Scanner;

import com.chat.demo.Utils.Menu;

public class MultiThreadHandler
{
    static Menu ob;
    public static void main(String[] args)
    {
        ob = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------- Welcome to Baat Karo App --------------------");
        ob.showMainMenu(sc);               
        
    }
    
}
