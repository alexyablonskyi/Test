package test.test;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class Test {
     public static void main(String[] args) {

	JSONObject obj = new JSONObject();
	obj.put("name", "Alex");
	obj.put("age", "28");
 
	JSONArray list = new JSONArray();
	list.add("NBA");
	list.add("Maimi");
	list.add("Heat");
 
	obj.put("options", list);
 
	try {
 
		FileWriter file = new FileWriter("C:\\Users\\oyablonskyi\\workspace\\Test\\test.json");
		file.write(obj.toJSONString());
		file.flush();
		file.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.print(obj);
 
    }
 
}