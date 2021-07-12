package guru.springframework.oneToMany;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonTest {
    public static void main(String[] args) throws Exception {
        //writeJsonSimpleDemo("example.json");

        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("example.json");
        Person ben = new Person(
                (String) jsonObject.get("name"),
                Integer.valueOf(jsonObject.get("age").toString()),
                (Boolean) jsonObject.get("isMarried"),
                (List<String>) jsonObject.get("hobbies"),
                (List<Person>) jsonObject.get("kids"));

        System.out.println(ben);
    }

    public static void writeJsonSimpleDemo(String filename) throws Exception {
        JSONObject sampleObject = new JSONObject();
        sampleObject.put("name", "Stackabuser");
        sampleObject.put("age", 35);

        JSONArray messages = new JSONArray();
        messages.add("Hey!");
        messages.add("What's up?!");

        sampleObject.put("messages", messages);
        Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
    }

    public static Object readJsonSimpleDemo(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }
}
