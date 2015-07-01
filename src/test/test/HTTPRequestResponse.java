package test.test;

import java.io.FileWriter;
import java.net.*;
import java.io.*;

public class HTTPRequestResponse {
    public static void main(String[] args) throws Exception {
    	
    	InputStream input = null;
    	OutputStream output = null;
    	try {
    	    //input = new URL("http://ip.jsontest.com/").openStream();
    	    input = new URL("http://search.twitter.com/search.json?q=hi").openStream();
    	   
    	    output = new FileOutputStream("C:\\Users\\oyablonskyi\\Documents\\GitHub\\Test\\test.json");
    	    byte[] buffer = new byte[1024];
    	    for (int length = 0; (length = input.read(buffer)) > 0;) {
    	        output.write(buffer, 0, length);
    	    }
    	    // Here you could append further stuff to `output` if necessary.
    	} finally {
    	    if (output != null) try { output.close(); } catch (IOException logOrIgnore) {}
    	    if (input != null) try { input.close(); } catch (IOException logOrIgnore) {}
    	}
    }
}
