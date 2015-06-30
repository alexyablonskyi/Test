package test.test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadJSON {
	public static void main(String[] args) throws Exception, IOException, ParseException {
        JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:/Users/oyablonskyi/workspace/Test/test.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println(name);
            if(name.equals("Alex")){
            	System.out.println("True");
            } else {
            	System.out.println("False");
            }
       
    }
}