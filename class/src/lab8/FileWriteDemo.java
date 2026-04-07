package lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileWriteDemo {
    public static void main(String[] args) {
        String filePath = "D:\\Java代码\\Code\\class\\src\\lab8\\test.txt";
        try (
                // 键盘输入流：InputStreamReader转换字节流为字符流，包装为BufferedReader
                BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
                // 文件输出流：FileWriter写入字符到文件，包装为BufferedWriter
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath))
        ) {
            System.out.println("请输入数据（每行1条，输入'exit'结束输入）：");
            String line;
            // 循环读取键盘输入，直到输入exit
            while ((line = keyboardReader.readLine()) != null) {
                if ("exit".equals(line)) {
                    System.out.println("输入结束，数据已写入test.txt");
                    break;
                }
                // 写入文件，并换行（newLine()适配不同系统换行符）
                fileWriter.write(line);
                fileWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("文件写入异常：" + e.getMessage());
        }
    }
}