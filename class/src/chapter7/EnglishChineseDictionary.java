package chapter7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class EnglishChineseDictionary extends JFrame {
    // 存储英汉词典数据（模拟字典库）
    private static final Map<String, String> DICTIONARY = new HashMap<>();

    // GUI组件
    private JTextField inputField;    // 英文输入框
    private JTextArea resultArea;    // 翻译结果显示区
    private JButton searchBtn;       // 查询按钮
    private JLabel titleLabel;       // 标题标签

    static {
        // 初始化词典数据（可扩展更多单词）
        DICTIONARY.put("apple", "苹果");
        DICTIONARY.put("banana", "香蕉");
        DICTIONARY.put("computer", "电脑");
        DICTIONARY.put("student", "学生");
        DICTIONARY.put("teacher", "老师");
        DICTIONARY.put("java", "一种编程语言/爪哇岛");
        DICTIONARY.put("program", "程序/节目");
        DICTIONARY.put("happy", "开心的/快乐的");
    }

    // 构造方法：初始化GUI
    public EnglishChineseDictionary() {
        initFrame();         // 初始化窗口
        initComponents();    // 初始化组件
        initLayout();        // 初始化布局
        initEvent();         // 初始化事件监听
    }

    /**
     * 1. 初始化窗口属性
     */
    private void initFrame() {
        setTitle("✨ 智能英汉速查词典 ✨");  // 自定义标题（带emoji更美观）
        setSize(500, 400);                // 窗口大小（宽500，高400）
        setLocationRelativeTo(null);      // 窗口居中显示
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // 关闭窗口时退出程序
        setResizable(false);              // 禁止调整窗口大小
        getContentPane().setBackground(new Color(245, 248, 250));  // 窗口背景色（浅蓝灰）
    }

    /**
     * 2. 初始化所有GUI组件（输入框、按钮、结果区等）
     */
    private void initComponents() {
        // 标题标签
        titleLabel = new JLabel("英文单词 → 中文翻译", SwingConstants.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));  // 字体：微软雅黑、加粗、20号
        titleLabel.setForeground(new Color(66, 133, 244));       // 字体颜色（谷歌蓝）

        // 英文输入框
        inputField = new JTextField();
        inputField.setFont(new Font("宋体", Font.PLAIN, 16));     // 输入框字体16号
        inputField.setBorder(BorderFactory.createLineBorder(new Color(66, 133, 244), 2));  // 边框颜色
        inputField.setText("请输入英文单词（例如：apple）");  // 提示文本（Java 17+支持）

        // 查询按钮
        searchBtn = new JButton("📖 立即查询");
        searchBtn.setFont(new Font("微软雅黑", Font.BOLD, 14));  // 按钮字体14号
        searchBtn.setBackground(new Color(66, 133, 244));       // 按钮背景色
        searchBtn.setForeground(Color.WHITE);                   // 按钮文字白色
        searchBtn.setBorderPainted(false);                     // 取消边框
        searchBtn.setFocusPainted(false);                      // 取消焦点框
        searchBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  // 鼠标悬浮变手型

        // 翻译结果显示区
        resultArea = new JTextArea();
        resultArea.setFont(new Font("宋体", Font.PLAIN, 16));    // 结果区字体16号
        resultArea.setEditable(false);                          // 禁止编辑
        resultArea.setBackground(new Color(255, 255, 255));     // 白色背景
        resultArea.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));  // 灰色边框
        // 自动换行
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        // 给结果区添加滚动条（当内容超出时显示）
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    /**
     * 3. 初始化布局（使用BorderLayout+FlowLayout组合布局）
     */
    private void initLayout() {
        // 主布局：BorderLayout（上下左右中五个区域）
        setLayout(new BorderLayout(15, 15));  // 组件之间的水平/垂直间距15像素

        // 顶部区域：标题（NORTH）
        add(titleLabel, BorderLayout.NORTH);

        // 中间区域：输入框+按钮（使用FlowLayout横向排列）
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        inputPanel.setBackground(new Color(245, 248, 250));  // 与窗口背景一致
        inputPanel.add(inputField);  // 添加输入框
        inputPanel.add(searchBtn);   // 添加查询按钮
        add(inputPanel, BorderLayout.CENTER);  // 中间区域显示输入面板

        // 底部区域：结果显示区（SOUTH）
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.SOUTH);
    }

    /**
     * 4. 初始化事件监听（按钮点击事件）
     */
    private void initEvent() {
        // 给查询按钮添加点击事件监听器
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. 获取输入框的英文单词（去除前后空格，转为小写）
                String englishWord = inputField.getText().trim().toLowerCase();

                // 2. 验证输入
                if (englishWord.isEmpty()) {
                    resultArea.setText("⚠️  请输入英文单词后再查询！");
                    resultArea.setForeground(Color.RED);  // 错误提示红色
                    return;
                }

                // 3. 从词典中查询翻译
                String chineseMeaning = DICTIONARY.get(englishWord);

                // 4. 显示结果
                if (chineseMeaning != null) {
                    resultArea.setText("✅ 翻译结果：\n" + englishWord + " → " + chineseMeaning);
                    resultArea.setForeground(new Color(34, 197, 94));  // 成功提示绿色
                } else {
                    resultArea.setText("❌ 未找到该单词的翻译！\n请尝试输入其他单词（例如：computer）");
                    resultArea.setForeground(Color.ORANGE);  // 未找到提示橙色
                }

                // 5. 清空输入框（可选优化）
                inputField.setText("");
            }
        });

        // 可选：给输入框添加回车触发查询（增强用户体验）
        inputField.addActionListener(e -> searchBtn.doClick());
    }

    /**
     * 主方法：程序入口
     */
    public static void main(String[] args) {
        // Swing组件必须在事件调度线程（EDT）中创建和显示（避免线程安全问题）
        SwingUtilities.invokeLater(() -> {
            EnglishChineseDictionary dictionary = new EnglishChineseDictionary();
            dictionary.setVisible(true);  // 显示窗口
        });
    }
}