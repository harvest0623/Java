package lab9;

import javax.swing.*;
import java.awt.*;

public class SurveySystem extends JFrame {
    private int score = 0;
    private Timer timer;
    private int timeLeft = 60; // 限时60秒
    private JLabel timeLabel;
    // 新增：保存多选题的错误选项引用（用于判断是否误选）
    private JCheckBox q3c;
    public SurveySystem() {
        // 窗口设置
        setTitle("调查问卷系统");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 计时区域
        JPanel timePanel = new JPanel();
        timeLabel = new JLabel("剩余时间：" + timeLeft + "秒");
        timePanel.add(timeLabel);
        add(timePanel, BorderLayout.NORTH);

        // 问卷内容区域
        JPanel surveyPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        surveyPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // 题目1（单选题）
        JLabel q1 = new JLabel("1. Java图形界面中，顶级容器是？");
        JRadioButton q1a = new JRadioButton("JFrame（正确）");
        JRadioButton q1b = new JRadioButton("JButton");
        JRadioButton q1c = new JRadioButton("JLabel");
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(q1a);
        bg1.add(q1b);
        bg1.add(q1c);
        JPanel q1Panel = new JPanel();
        q1Panel.add(q1);
        q1Panel.add(q1a);
        q1Panel.add(q1b);
        q1Panel.add(q1c);
        surveyPanel.add(q1Panel);

        // 题目2（单选题）
        JLabel q2 = new JLabel("2. 事件监听器的作用是？");
        JRadioButton q2a = new JRadioButton("创建组件");
        JRadioButton q2b = new JRadioButton("处理用户操作（正确）");
        JRadioButton q2c = new JRadioButton("管理布局");
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(q2a);
        bg2.add(q2b);
        bg2.add(q2c);
        JPanel q2Panel = new JPanel();
        q2Panel.add(q2);
        q2Panel.add(q2a);
        q2Panel.add(q2b);
        q2Panel.add(q2c);
        surveyPanel.add(q2Panel);

        // 题目3（多选题）- 修正题目描述（选对1个得1分，满分2分）
        JLabel q3 = new JLabel("3. 以下属于布局管理器的是？（多选，选对1个得1分，选错不得分）");
        JCheckBox q3a = new JCheckBox("FlowLayout（正确）");
        JCheckBox q3b = new JCheckBox("BorderLayout（正确）");
        q3c = new JCheckBox("JTextFiled（错误）"); // 赋值给成员变量，方便后续判断
        JPanel q3Panel = new JPanel();
        q3Panel.add(q3);
        q3Panel.add(q3a);
        q3Panel.add(q3b);
        q3Panel.add(q3c);
        surveyPanel.add(q3Panel);

        // 提交按钮
        JButton submitBtn = new JButton("提交问卷");
        submitBtn.addActionListener(e -> calculateScore(q1a, q2b, q3a, q3b));
        surveyPanel.add(submitBtn);

        add(surveyPanel, BorderLayout.CENTER);

        // 计时器
        timer = new Timer(1000, e -> {
            timeLeft--;
            timeLabel.setText("剩余时间：" + timeLeft + "秒");
            if (timeLeft <= 0) {
                timer.stop();
                calculateScore(q1a, q2b, q3a, q3b);
            }
        });
        timer.start();
    }
    private void calculateScore(JRadioButton q1a, JRadioButton q2b, JCheckBox q3a, JCheckBox q3b) {
        timer.stop();
        score = 0;

        if (q1a.isSelected()) score += 1; // 第1题满分1分
        if (q2b.isSelected()) score += 1; // 第2题满分1分

        // 多选题计分
        // 规则：只要勾选错误选项（q3c），本题不得分；否则按正确选项数量计分
        if (!q3c.isSelected()) {
            if (q3a.isSelected()) score += 1; // 选对1个得1分
            if (q3b.isSelected()) score += 1; // 选对1个得1分
        }

        // 弹窗显示结果
        JOptionPane.showMessageDialog(this,
                "问卷提交成功！你的得分：" + score + "分（满分4分）",
                "得分结果",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SurveySystem().setVisible(true));
    }
}