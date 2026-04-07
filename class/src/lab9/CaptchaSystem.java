package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class CaptchaSystem extends JFrame {
    private JLabel captchaLabel;
    private JTextField inputField;
    private String correctCaptcha;
    public CaptchaSystem() {
        // 窗口设置
        setTitle("验证码验证系统");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 验证码区域
        JPanel captchaPanel = new JPanel();
        captchaLabel = new JLabel();
        generateCaptcha(); // 生成初始验证码
        captchaPanel.add(captchaLabel);
        add(captchaPanel, BorderLayout.CENTER);

        // 输入和按钮区域
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        inputField = new JTextField(10);
        JButton verifyBtn = new JButton("验证");
        JButton refreshBtn = new JButton("刷新验证码");

        inputPanel.add(new JLabel("请输入验证码："));
        inputPanel.add(inputField);
        inputPanel.add(verifyBtn);
        inputPanel.add(refreshBtn);
        add(inputPanel, BorderLayout.SOUTH);

        // 验证逻辑
        verifyBtn.addActionListener(e -> {
            String input = inputField.getText().trim();
            if (input.equalsIgnoreCase(correctCaptcha)) {
                JOptionPane.showMessageDialog(this, "验证码正确！验证通过～");
            } else {
                JOptionPane.showMessageDialog(this, "验证码错误！请重新输入");
                generateCaptcha(); // 错误后刷新验证码
                inputField.setText("");
            }
        });

        // 刷新验证码
        refreshBtn.addActionListener(e -> {
            generateCaptcha();
            inputField.setText("");
        });
    }

    // 生成4位随机验证码图片
    private void generateCaptcha() {
        // 生成随机字符（字母+数字）
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        correctCaptcha = sb.toString();

        // 创建验证码图片（宽120，高40）
        BufferedImage image = new BufferedImage(120, 40, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();

        // 背景色（浅灰色）
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 120, 40);

        // 绘制干扰线（5条）
        g.setColor(Color.GRAY);
        for (int i = 0; i < 5; i++) {
            int x1 = random.nextInt(120);
            int y1 = random.nextInt(40);
            int x2 = random.nextInt(120);
            int y2 = random.nextInt(40);
            g.drawLine(x1, y1, x2, y2);
        }

        // 绘制验证码字符（随机颜色、随机位置偏移）
        g.setFont(new Font("Arial", Font.BOLD, 20));
        for (int i = 0; i < 4; i++) {
            g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            int x = 20 + i * 20;
            int y = 25 + random.nextInt(10) - 5; // 上下偏移±5像素
            g.drawString(String.valueOf(correctCaptcha.charAt(i)), x, y);
        }

        g.dispose();
        captchaLabel.setIcon(new ImageIcon(image));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CaptchaSystem().setVisible(true));
    }
}