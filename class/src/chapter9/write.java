package chapter9;

import java.io.*;
public class write {
    public static void main(String[] args) {
        // 创建文件对象，设定输出流的目标
        File fWrite = new File("D:\\Java代码\\Code\\class\\src\\lab8\\test.txt");
        try{
            // 创建指向目标输出的输出流
            FileWriter fw = new FileWriter(fWrite);
            BufferedWriter bw = new BufferedWriter(fw);

            // 通过输出流将数据写入目标
            bw.write("Hello Java!");
            bw.newLine();
            bw.write("I am a boy.");

            // 刷新缓冲区，将数据写入目标
            bw.flush();

            // 关闭输出流
            bw.close();
            fw.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
