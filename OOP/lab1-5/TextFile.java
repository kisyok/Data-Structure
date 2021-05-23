
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhoe
 */
public class TextFile implements FileIO{
    private String path;
    
    public TextFile(String path){
        this.path = path;
    }

    @Override
    public String read() {
        String out="";
        String line;
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            while((line = in.readLine()) != null) {
                out+=line+"\n";
            }
        } catch (IOException ex) {
            System.out.println("File not found");
        }
        return out;
    }

    @Override
    public void write(String s) {
        try {
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(s);
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
}
