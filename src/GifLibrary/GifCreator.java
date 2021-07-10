package GifLibrary;

import java.util.Set;

public class GifCreator {
    public static void createGif(String jSONString, int sizeX, int sizeY){

        JSONWork jsonWork = new JSONWork();
        Set <Image> images = jsonWork.toArray(jSONString);
    }
}
