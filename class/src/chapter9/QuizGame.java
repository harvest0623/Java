package chapter9;

import java.util.Scanner;

public class QuizGame {
    // 定义题目：每个题目包含题干、选项、正确答案
    static class Question {
        String content;
        String[] options;
        char correctAnswer;

        public Question(String content, String[] options, char correctAnswer) {
            this.content = content;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // 初始化题目列表（与用户提供的题目对应）
        Question[] questions = {
                new Question(
                        "1. 北京奥运是什么时间开幕的？",
                        new String[]{"A.2008-08-08", "B.2008-08-01", "C.2008-10-01", "D.2008-07-08"},
                        'A'
                ),
                new Question(
                        "2. 下列哪个国家不属于亚洲？",
                        new String[]{"A.沙特", "B.印度", "C.巴西", "D.越南"},
                        'C'
                ),
                new Question(
                        "3. 2010年世界杯是在哪个国家举行的？",
                        new String[]{"A.美国", "B.英国", "C.南非", "D.巴西"},
                        'C'
                ),
                new Question(
                        "4. 下列哪种动物属于猫科动物？",
                        new String[]{"A.鬣狗", "B.犀牛", "C.大象", "D.狮子"},
                        'D'
                )
        };

        // 逐题展示并交互
        for (Question q : questions) {
            // 显示题干和选项
            System.out.println("\n" + q.content);
            for (String option : q.options) {
                System.out.println(option);
            }

            // 读取用户输入（处理不规范输入）
            char userAnswer = ' ';
            while (true) {
                System.out.print("请输入你的答案：");
                String input = scanner.nextLine().trim().toUpperCase();
                if (input.length() == 1 && (input.charAt(0) >= 'A' && input.charAt(0) <= 'D')) {
                    userAnswer = input.charAt(0);
                    break;
                } else {
                    System.out.println("输入无效，请输入A/B/C/D中的一个！");
                }
            }

            // 判断答案并计分
            if (userAnswer == q.correctAnswer) {
                System.out.println("回答正确！");
                score++;
            } else {
                System.out.println("回答错误，正确答案是：" + q.correctAnswer);
            }
        }

        // 显示最终得分
        System.out.println("\n===== 答题结束 =====");
        System.out.println("你的得分：" + score + " / " + questions.length);
        scanner.close();
    }
}