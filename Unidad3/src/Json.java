import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
// import

public class Json {
    public static void main(String[] args) {
        try{
        // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("JSONFile.json"));
        // Convertir objeto a JSON y procesarlo
        JSONObject js = (JSONObject) ob;
        String firstName = (String) js.get("firstName");
        String lastName = (String) js.get("lastName");
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        JSONArray arr = (JSONArray) js.get("phoneNumbers");
        for (Object item:arr) {
            JSONObject data = (JSONObject) item;
            String post_id = (String) data.get("phone-number");
            System.out.println(post_id);
        }
    }catch(IOException e){
        System.out.println("Error de lectura JSON");
    } catch(org.json.simple.parser.ParseException e){
        e.printStackTrace();
    }
    }
}        
