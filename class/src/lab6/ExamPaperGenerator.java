package lab6;
import java.util.*;
public class ExamPaperGenerator {
    public static void main(String[] args) {
        // 1. 初始化所有题目
        Set<ChoiceQuestion> allQuestions = initAllQuestions();
        System.out.println("成功初始化" + allQuestions.size() + "道选择题\n");

        // 2. 随机抽取5道题目
        List<ChoiceQuestion> randomQuestions = getRandomQuestions(allQuestions, 5);

        //3. 生成试卷
        Set<ChoiceQuestion>[] examPapers = generate4ExamPapers(randomQuestions);

        //4. 输出试卷
        System.out.println("===== 第1套试卷 =====");
        printExamPaper(examPapers[0]);
    }
    private static Set<ChoiceQuestion> initAllQuestions() {
        Set<ChoiceQuestion> questions = new HashSet<>();
        // 添加10道示例选择题
        questions.add(new ChoiceQuestion(
                "1. Java中哪个关键字用于继承类？",
                "final", "extends", "implements", "static",
                "B"
        ));
        questions.add(new ChoiceQuestion(
                "2. 以下哪种集合是无序不重复的？",
                "ArrayList", "LinkedList", "HashSet", "TreeMap",
                "C"
        ));
        questions.add(new ChoiceQuestion(
                "3. 方法重写要求的条件不包括？",
                "方法名相同", "参数列表相同", "返回值兼容", "访问权限更严格",
                "D"
        ));
        questions.add(new ChoiceQuestion(
                "4. 以下哪个不是Java基本数据类型？",
                "int", "String", "boolean", "double",
                "B"
        ));
        questions.add(new ChoiceQuestion(
                "5. 异常处理中，finally块的执行时机是？",
                "异常发生前", "异常处理后", "无论是否异常都会执行", "仅异常发生时执行",
                "C"
        ));
        questions.add(new ChoiceQuestion(
                "6. 静态方法不能访问以下哪种成员？",
                "静态变量", "静态方法", "实例变量", "类变量",
                "C"
        ));
        questions.add(new ChoiceQuestion(
                "7. 以下哪个类用于读取控制台输入？",
                "Scanner", "PrintStream", "BufferedReader", "FileReader",
                "A"
        ));
        questions.add(new ChoiceQuestion(
                "8. 接口中定义的方法默认修饰符是？",
                "public", "private", "protected", "default",
                "A"
        ));
        questions.add(new ChoiceQuestion(
                "9. 以下哪种排序算法时间复杂度最优？",
                "冒泡排序", "选择排序", "快速排序", "插入排序",
                "C"
        ));
        questions.add(new ChoiceQuestion(
                "10. Java中线程的启动方法是？",
                "run()", "start()", "execute()", "begin()",
                "B"
        ));
        return questions;
    }
    /**
     * 从所有题目中随机抽取指定数量的不重复题目
     * @param allQuestions 所有题目集合
     * @param count 抽取数量（此处固定为5）
     * @return 随机抽取的题目列表（便于后续打乱顺序）
     */
    private static List<ChoiceQuestion> getRandomQuestions(Set<ChoiceQuestion> allQuestions, int count) {
        // 将HashSet转为List，方便随机访问
        List<ChoiceQuestion> questionList = new ArrayList<>(allQuestions);
        Random random = new Random();
        List<ChoiceQuestion> selected = new ArrayList<>();

        // 随机抽取count道题（避免重复抽取）
        while (selected.size() < count) {
            int randomIndex = random.nextInt(questionList.size());
            ChoiceQuestion q = questionList.get(randomIndex);
            if (!selected.contains(q)) { // 保证抽取的5题不重复
                selected.add(q);
            }
        }
        return selected;
    }

    /**
     * 生成4套试卷：每套包含5道题，题目顺序不同
     * @param baseQuestions 随机抽取的5道基础题目
     * @return 4个HashSet组成的数组（每套试卷一个HashSet）
     */
    @SuppressWarnings("unchecked")
    private static Set<ChoiceQuestion>[] generate4ExamPapers(List<ChoiceQuestion> baseQuestions) {
        Set<ChoiceQuestion>[] examPapers = new Set[4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            // 每次生成试卷时，复制基础题目列表并打乱顺序
            List<ChoiceQuestion> shuffled = new ArrayList<>(baseQuestions);
            Collections.shuffle(shuffled, random); // 随机打乱题目顺序

            // 将打乱后的题目存入HashSet（保证每套试卷内题目不重复）
            examPapers[i] = new HashSet<>(shuffled);
        }
        return examPapers;
    }

    /**
     * 遍历输出一套试卷的所有题目
     * @param examPaper 单套试卷（HashSet）
     */
    private static void printExamPaper(Set<ChoiceQuestion> examPaper) {
        int questionNum = 1;
        for (ChoiceQuestion question : examPaper) {
            System.out.println("第" + questionNum + "题：");
            System.out.println(question); // 调用toString()方法输出完整题目
            questionNum++;
        }
    }
}
