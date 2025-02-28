package com.chat.demo.Utils;
import java.util.Scanner;
import com.chat.demo.Secrets.Key;

public class Inputs
{
    public static String enterPassword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = sc.next();
        sc.close();
        return password;
    }

    public static boolean isAuthorized(String password)
    {
        if(password.equals(Key.SECRET_KEY))
            return true;
        return false;
    }
    
}
