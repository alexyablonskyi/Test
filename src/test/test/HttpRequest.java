package test.test;

import java.net.*;
import java.io.*;

public class HttpRequest {
    public static void main(String[] args) throws Exception {
        URL yahoo = new URL("http://52.26.33.185:8080/inventory?sku=100008&sku=100276&sku=100801&format=demandware");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}
