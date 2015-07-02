package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.json.Json;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
 
public class JsonGenerator {
 
	public static void main(String[] args) {
		FileWriter writer = null;
		JSONParser parser = new JSONParser();
		Object simpleObj = null;
 
 
		try {
			simpleObj = parser.parse(new FileReader("C:\\Users\\oyablonskyi\\workspace\\json\\test.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//System.out.println("Simple JSON Result:\n" + simpleObj.toString());
		
		String prettyJson = crunchifyPrettyJSONUtility(simpleObj.toString());
		System.out.println("\nPretty JSON Result:\n" + prettyJson);
 
	}
 
	// Pretty JSON Utility
	public static String crunchifyPrettyJSONUtility(String simpleJSON) {
		JsonParser crunhifyParser = new JsonParser();
		JsonObject json = crunhifyParser.parse(simpleJSON).getAsJsonObject();
 
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = prettyGson.toJson(json);
 
		return prettyJson;
	}
}
