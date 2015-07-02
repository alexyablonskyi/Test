package json;

import java.io.FileReader;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
/**
 * @author Crunchify.com
 */
 
public class ReadJSON {
 
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader(
                    "C:\\Users\\oyablonskyi\\workspace\\json\\test.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String color = (String) jsonObject.get("color");
            
            /*String author = (String) jsonObject.get("Author");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
 */
            System.out.println("Color: " + color);
            /*
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }*/
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}