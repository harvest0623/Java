package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadAndCountDemo {
    public static void main(String[] args) {
        String filePath = "D:\\Java代码\\Code\\class\\src\\lab8\\test.txt";
        int totalCharCount = 0; // 总字符数（不含空格、换行符）
        int totalWordCount = 0; // 总单词数

        try (
                // 文件输入流：FileReader读取文件字符，包装为BufferedReader
                BufferedReader fileReader = new BufferedReader(new FileReader(filePath))
        ) {
            System.out.println("开始读取test.txt并统计...");
            String line;
            // 逐行读取文件
            while ((line = fileReader.readLine()) != null) {
                // 1. 统计当前行的字符数（过滤空格）
                int lineCharCount = line.replaceAll(" ", "").length();
                totalCharCount += lineCharCount;

                // 2. 统计当前行的单词数（以空格、标点分隔）
                // 正则表达式：匹配非字母、非数字的字符作为分隔符，拆分单词
                String[] words = line.split("[^a-zA-Z0-9\u4e00-\u9fa5]+");
                for (String word : words) {
                    // 过滤空字符串（避免多个分隔符导致的空数组元素）
                    if (!word.isEmpty()) {
                        totalWordCount++;
                    }
                }
            }

            // 输出统计结果
            System.out.println("统计结果：");
            System.out.println("总字符数（不含空格、换行符）：" + totalCharCount);
            System.out.println("总单词数：" + totalWordCount);
        } catch (IOException e) {
            System.out.println("文件读取异常：" + e.getMessage());
        }
    }
}