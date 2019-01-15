package utils;

import com.google.gson.Gson;
import org.openqa.selenium.json.Json;

public class JsonUtils {

    private JsonUtils(){

    }

    public static String toJson(final Object objectToJson){
        final Gson gson = new Gson();
        return gson.toJson(objectToJson);
    }

}
