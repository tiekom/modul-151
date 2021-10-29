import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 2
        try {
            JSONObject jsonObj = new JSONObject("{\"vorname\":\"Peter\",\"nachname\":\"Muster\"}");
            System.out.println(jsonObj.get("vorname"));
            System.out.println(jsonObj.get("nachname"));
        } catch (JSONException ignored) {
        }
        // Aufgabe 3
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Reader reader = new FileReader("family.json")) {
            JsonElement json = gson.fromJson(reader, JsonElement.class);
            String jsonString = gson.toJson(json);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
