package tasks.classwork.Day7;

import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        write();
    }

    //public static void read() throws IOException {

     //   BufferedReader in = new BufferedReader(new FileReader("new.txt"));
       // String line;
      //  while ((line = in.readLine()) != null) {
        //    System.out.println(line);
       // }
       // in.close();
   // }
    public static void write() throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("new1.txt"));
        out.write("papa mila ramu");
        out.newLine();
        out.newLine();
        out.write("papa mila ramu");
        out.newLine();
        out.newLine();
        out.write("papa mila ramu");
        out.close();
    }
}
