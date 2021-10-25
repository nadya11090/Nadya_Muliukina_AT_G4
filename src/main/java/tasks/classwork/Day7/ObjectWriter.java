package tasks.classwork.Day7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectWriter {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("stol1");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Table table = (Table) ois.readObject();
        ois.close();
        System.out.println(table.toString());
    }

}
