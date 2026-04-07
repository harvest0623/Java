package lab5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TextCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 文本统计程序 =====");
        System.out.print("请输入一行文本：");
        String text = sc.nextLine();
        int wordCount = countWords(text);
        int numCount = countNums(text);
        System.out.println("单词个数：" + wordCount);
        System.out.println("数字个数：" + numCount);
    }
    public static int countWords(String text) {
        String wordRegex = "\\b[\\u4e00-\\u9fa5a-zA-Z_][\\u4e00-\\u9fa5a-zA-Z0-9_]*\\b";
        Pattern pattern = Pattern.compile(wordRegex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    public static int countNums(String text) {
        String numRegex = "\\b\\d+\\b";
        Pattern pattern = Pattern.compile(numRegex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
