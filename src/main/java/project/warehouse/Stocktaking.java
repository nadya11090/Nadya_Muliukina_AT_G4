package project.warehouse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Stocktaking {

    private Stocktaking() {

    }

    public static void registerBox(VesselBox box) throws IOException {

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //  oos.writeObject(new VesselBox<>());
        oos.close();
    }

    public static void disposeBox(VesselBox box) {

    }

    //private static final void FILE {
    //    Path testFilePath = Paths.get("C:\\Users\\user\\Downloads\\stocktaking.txt");
   // }

    public static void getInfo() {
        System.out.println();

    }
}