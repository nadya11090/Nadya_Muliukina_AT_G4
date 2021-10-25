package tasks.classwork.Day7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("stol1");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Table(500, "white"));
        oos.close();
    }
}
