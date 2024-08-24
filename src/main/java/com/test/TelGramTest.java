package com.test;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class TelGramTest {
    public static void main(String a[]) {
        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";

        //Add Telegram token (given Token is fake)
        String apiToken = "5894577759:AAEgABAydp8N615Nuy9gL7PF5pqxiwfIbWk";
      
        //Add chatId (given chatId is fake)
        String chatId = "-1001826435529";
        String text = "Hello  Shoogloo !";

        urlString = String.format(urlString, apiToken, chatId, text);

        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  
}