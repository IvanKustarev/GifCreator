package GifLibrary;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.HashSet;
import java.util.Set;

public class JSONWork {
    public Set<Image> toArray (String jsonString){
        JSONArray jsonArray = toJSONArray(jsonString);
        Set<Image> images = creatImageArr(jsonArray);
        return images;
    }

    private JSONArray toJSONArray(String jsonString){
        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObject = null;
        try {
            jsonObject = (JSONObject) new JSONParser().parse(jsonString);
        }catch (Exception e){
            e.printStackTrace();
        }

        boolean err = false;
        int i = 1;
        while (!err){

            Object obj = jsonObject.get("y" + i);
            if (obj == null){
                err = true;
            }
            else {
                jsonArray.add(obj);
            }
            i++;
        }
        return jsonArray;
    }

    private Set<Image> creatImageArr(JSONArray jsonArray){
        Set<Image> images = new HashSet<>();

        for (int i = 0; i < jsonArray.size(); i++){
            int j = 1;
            JSONObject jsonObjectY = (JSONObject) jsonArray.get(i);
            while (jsonObjectY.get("x"+j) != null){
                int k = 1;
                JSONObject jsonObjectX = (JSONObject) jsonObjectY.get("x"+j);
                while (jsonObjectX.get("z"+k) != null){
                    images.add(new Image(j, i, k, (String) jsonObjectX.get("z"+k)));
                    k++;
                }
                j++;
            }
        }

        return images;
    }
}
