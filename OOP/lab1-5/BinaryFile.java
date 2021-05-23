
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhoe
 */
public class BinaryFile implements FileIO{
    private String path;
    
    public BinaryFile(String path){
        this.path = path;
    }

    @Override
    public String read() {
        String out = "";
        try {
            ObjectInputStream ois = 
                    new ObjectInputStream(new FileInputStream(path));
            while(ois.available()>0) {
                out+=ois.readUTF()+"\n";
            }
        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return out;
    }

    @Override
    public void write(String s) {
        try {
            ObjectOutputStream oout = 
                    new ObjectOutputStream(new FileOutputStream(path));
            oout.writeUTF(s);
            oout.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
    
}
