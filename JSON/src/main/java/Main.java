import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            JSONObject jsonObj = new JSONObject("{\"vorname\":\"Peter\",\"nachname\":\"Muster\"}");
            System.out.println(jsonObj.get("vorname"));
            System.out.println(jsonObj.get("nachname"));
        } catch (JSONException e) {
        }
    }
}
