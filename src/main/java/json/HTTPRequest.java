package json;


import java.io.FileWriter;
import java.net.*;
import java.io.*;

public class HTTPRequest {
    public static void main(String[] args) throws Exception {
    	
    	InputStream input = null;
    	OutputStream output = null;
    	try {
    	    input = new URL("http://cdn.crunchify.com/wp-content/uploads/code/jsonArray.txt").openStream();
    	    //input = new URL("http://search.twitter.com/search.json?q=hi").openStream();
    	   
    	    output = new FileOutputStream("C:\\Users\\oyablonskyi\\workspace\\json\\test.json");
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
