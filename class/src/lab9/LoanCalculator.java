package lab9;

import javax.swing.*;
import java.awt.*;

public class LoanCalculator extends JFrame {
    private JTextField loanAmountField; // 贷款金额
    private JTextField rateField; // 年利率
    private JTextField yearField; // 贷款年限
    private JTextArea resultArea;

    public LoanCalculator() {
        // 窗口设置
        setTitle("贷款计算器");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 输入区域
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        inputPanel.add(new JLabel("贷款金额（元）："));
        loanAmountField = new JTextField();
        inputPanel.add(loanAmountField);

        inputPanel.add(new JLabel("年利率（%）："));
        rateField = new JTextField();
        inputPanel.add(rateField);

        inputPanel.add(new JLabel("贷款年限（年）："));
        yearField = new JTextField();
        inputPanel.add(yearField);

        // 计算按钮
        JPanel btnPanel = new JPanel();
        JButton equalPrincipalInterest = new JButton("等额本息");
        JButton equalPrincipal = new JButton("等额本金");
        btnPanel.add(equalPrincipalInterest);
        btnPanel.add(equalPrincipal);
        inputPanel.add(btnPanel);

        add(inputPanel, BorderLayout.NORTH);

        // 结果显示区域
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);

        // 等额本息计算
        equalPrincipalInterest.addActionListener(e -> calculateEqualPrincipalInterest());

        // 等额本金计算
        equalPrincipal.addActionListener(e -> calculateEqualPrincipal());
    }

    // 等额本息：每月还款额 = 贷款本金 × [月利率×(1+月利率)^还款月数] ÷ [(1+月利率)^还款月数 - 1]
    private void calculateEqualPrincipalInterest() {
        try {
            double loanAmount = Double.parseDouble(loanAmountField.getText());
            double annualRate = Double.parseDouble(rateField.getText()) / 100;
            int years = Integer.parseInt(yearField.getText());
            int months = years * 12;
            double monthlyRate = annualRate / 12;

            double monthlyPayment = loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, months))
                    / (Math.pow(1 + monthlyRate, months) - 1);
            double totalPayment = monthlyPayment * months;
            double interest = totalPayment - loanAmount;

            resultArea.setText("=== 等额本息还款方案 ===\n");
            resultArea.append("每月还款额：" + String.format("%.2f", monthlyPayment) + "元\n");
            resultArea.append("总还款额：" + String.format("%.2f", totalPayment) + "元\n");
            resultArea.append("总支付利息：" + String.format("%.2f", interest) + "元\n");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "请输入有效的数字！");
        }
    }

    // 等额本金：每月还款额 = （贷款本金 ÷ 还款月数） + （贷款本金 - 已还本金累计额）× 月利率
    private void calculateEqualPrincipal() {
        try {
            double loanAmount = Double.parseDouble(loanAmountField.getText());
            double annualRate = Double.parseDouble(rateField.getText()) / 100;
            int years = Integer.parseInt(yearField.getText());
            int months = years * 12;
            double monthlyRate = annualRate / 12;
            double principalPerMonth = loanAmount / months; // 每月应还本金

            resultArea.setText("=== 等额本金还款方案 ===\n");
            resultArea.append("每月固定本金：" + String.format("%.2f", principalPerMonth) + "元\n");
            resultArea.append("首月还款额：" + String.format("%.2f", principalPerMonth + loanAmount * monthlyRate) + "元\n");
            resultArea.append("末月还款额：" + String.format("%.2f", principalPerMonth + principalPerMonth * monthlyRate) + "元\n");

            double totalInterest = (months + 1) * loanAmount * monthlyRate / 2;
            double totalPayment = loanAmount + totalInterest;
            resultArea.append("总还款额：" + String.format("%.2f", totalPayment) + "元\n");
            resultArea.append("总支付利息：" + String.format("%.2f", totalInterest) + "元\n");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "请输入有效的数字！");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoanCalculator().setVisible(true));
    }
}