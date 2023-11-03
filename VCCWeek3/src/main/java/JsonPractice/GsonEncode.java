package JsonPractice;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class GsonEncode {
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Fish");
        animals.add("Chicken");
        animals.add("Bird");
        animals.add("Dog");

        // Serialization
        String jsonList = gson.toJson(animals);
        System.out.println(jsonList);
    }
}