package test.test;

import java.io.FileWriter;
import java.net.*;
import java.io.*;

public class HttpRequest {
    public static void main(String[] args) throws Exception {
        //URL yahoo = new URL("http://52.26.33.185:8080/inventory?sku=100008&sku=100276&sku=100801&format=demandware");
        //preparing
    	String charset = "UTF-8";
        URL yahoo = new URL("http://ip.jsontest.com/");
        
        //Send GET request 
        URLConnection connection = yahoo.openConnection();
        connection.setRequestProperty("Accept-Charset", charset);
        
        //Get response
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                connection.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}
