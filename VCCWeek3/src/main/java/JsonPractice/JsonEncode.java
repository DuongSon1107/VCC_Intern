package JsonPractice;

import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.StringWriter;

public class JsonEncode {
    public static void main(String[] args) throws IOException {
        //chuyen object -> string
        JSONObject obj = new JSONObject();

        obj.put("name","Duong Son");
        obj.put("id",new Integer(20));
        obj.put("salary",new Double(100.21));
        obj.put("is_Student",new Boolean(true));

        StringWriter out = new StringWriter();
        obj.writeJSONString(out);

        String jsonText = out.toString();
        System.out.print(jsonText);
    }
}
