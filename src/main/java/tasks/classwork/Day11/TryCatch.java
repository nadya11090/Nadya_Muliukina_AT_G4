package tasks.classwork.Day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TryCatch {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("t.tmp");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.flush();

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
