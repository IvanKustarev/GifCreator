package GifLibrary;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GifCreator {
    public static void createGif(String jSONString, int sizeX, int sizeY){



        JSONObject jsonObject = null;
        try {
            jsonObject = (JSONObject) (new JSONParser()).parse(jSONString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
