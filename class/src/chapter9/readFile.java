package chapter9;

import java.io.*;
public class readFile {
    public static void main(String[] args){
        // 创建文件对象，设定输入流的源
        File fRead = new File("D:\\Java代码\\Code\\class\\src\\lab8\\test.txt");
        try{
            // 创建指向源的输入流
            FileReader fr = new FileReader(fRead);
            BufferedReader br = new BufferedReader(fr);

            //通过输入流读取源中的数据
            String str = null;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }

            // 关闭输入流
            br.close();
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
