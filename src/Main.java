import GifLibrary.GifCreator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String [] args){
        File file = new File("D:\\programs\\Java\\projects\\GifCreator\\src\\Test.json");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
        }
        catch (Exception e){
            System.out.println(1);
        }

        String line = null;
        String jSONString = new String();
        try {
            while((line = bufferedReader.readLine()) != null) {
                jSONString += line;
                System.out.println(line);
            }
        }
        catch (Exception e){

        }

        GifCreator.createGif(jSONString, 1, 1);
    }
}
