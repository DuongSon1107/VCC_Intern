package JsonPractice;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecode {
    public static void main(String[] args) {
        //parse String -> object
        String jsonStr = "{\"name\":\"Duong Son\",\"salary\":100.21,\"id\":20,\"isStudent\":true}";
        Object obj = JSONValue.parse(jsonStr);
        JSONObject jsonObject = (JSONObject) obj;

        //Lay gia tri
        String name = (String) jsonObject.get("name");
        double salary = (Double) jsonObject.get("salary");
        long id = (Long) jsonObject.get("id");
        boolean isStudent = (Boolean) jsonObject.get("isStudent");
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
        System.out.println("age: " + id);
        System.out.println("isStudent: "+ isStudent);
    }
}