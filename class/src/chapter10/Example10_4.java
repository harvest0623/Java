package chapter10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example10_4 {
    public static void main(String[] args) {
        int n=-1;
        byte [] a=new byte[100];
        try{  File f=new File("D:\\java代码\\Code\\class\\src\\chapter10\\Example10_4.java");
            InputStream in = new FileInputStream(f);
            while((n=in.read(a,0,100))!=-1) {
                String s=new String (a,0,n);
                System.out.print(s);
            }
            in.close();
        }
        catch(IOException e) {
            System.out.println("File read Error"+e);
        }
    }
}
