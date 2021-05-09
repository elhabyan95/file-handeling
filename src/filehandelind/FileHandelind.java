package filehandelind;

import java.io.*;
import static java.lang.System.in;
import java.lang.System;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.internal.util.xml.impl.Input;

public class FileHandelind {

    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(r);

        System.out.println("please enter any String and enter stop to close");
        try {

            FileWriter writer = new FileWriter("F:\\test.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            String str;

            do {
                str = br.readLine();


                if (!str.equals("stop")) {
                    bw.write(str+"\n");
                }

            } while (!str.equals("stop"));
            
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(FileHandelind.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
