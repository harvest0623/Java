package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String currentInput = "0";
    private String operator = "";
    private double result = 0;
    private boolean isNewInput = true;
    private double memory = 0;

    public SwingCalculator() {
        super("标准计算器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 500);
        setResizable(false);
        setLayout(new BorderLayout());

        // 显示区域
        display = new JTextField(currentInput);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 36));
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        add(display, BorderLayout.NORTH);

        // 按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 5, 5, 5));
        buttonPanel.setBackground(Color.DARK_GRAY);
        add(buttonPanel, BorderLayout.CENTER);

        // 按钮文本（按行定义，与参考样式布局一致）
        String[][] buttons = {
                {"MC", "MR", "M+", "M-", "MS"},
                {"M±", "%", "CE", "C", "⌫"},
                {"1/x", "x²", "√x", "÷", "7"},
                {"8", "9", "×", "4", "5"},
                {"6", "-", "1", "2", "3"},
                {"+", "±", "0", ".", "="}
        };

        // 添加按钮
        for (String[] row : buttons) {
            for (String text : row) {
                JButton btn = createButton(text);
                buttonPanel.add(btn);
            }
        }

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Arial", Font.BOLD, 16));
        btn.addActionListener(this);

        if (text.matches("[+\\-×÷=]")) {
            btn.setBackground(new Color(255, 159, 64));
            btn.setForeground(Color.WHITE);
        } else if (text.matches("[0-9.]")) {
            btn.setBackground(new Color(50, 50, 50));
            btn.setForeground(Color.WHITE);
        } else {
            btn.setBackground(new Color(80, 80, 80));
            btn.setForeground(Color.WHITE);
        }

        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder());
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                handleNumber(command);
                break;
            case ".":
                handleDecimal();
                break;
            case "+":
            case "-":
            case "×":
            case "÷":
                handleOperator(command);
                break;
            case "=":
                calculate();
                break;
            case "C":
                clearAll();
                break;
            case "CE":
                clearCurrent();
                break;
            case "⌫":
                backspace();
                break;
            case "±":
                toggleSign();
                break;
            case "%":
                percentage();
                break;
            case "1/x":
                reciprocal();
                break;
            case "x²":
                square();
                break;
            case "√x":
                squareRoot();
                break;
            case "MC":
                memoryClear();
                break;
            case "MR":
                memoryRecall();
                break;
            case "M+":
                memoryAdd();
                break;
            case "M-":
                memorySubtract();
                break;
            case "MS":
                memoryStore();
                break;
            case "M±":
                memoryToggleSign();
                break;
        }
    }

    private void handleNumber(String num) {
        if (isNewInput) {
            currentInput = num;
            isNewInput = false;
        } else {
            currentInput += num;
        }
        display.setText(currentInput);
    }

    private void handleDecimal() {
        if (isNewInput) {
            currentInput = "0.";
            isNewInput = false;
        } else if (!currentInput.contains(".")) {
            currentInput += ".";
        }
        display.setText(currentInput);
    }

    private void handleOperator(String op) {
        if (!operator.isEmpty()) {
            calculate();
        }
        result = Double.parseDouble(currentInput);
        operator = op;
        isNewInput = true;
    }

    private void calculate() {
        if (operator.isEmpty()) return;

        double num = Double.parseDouble(currentInput);
        switch (operator) {
            case "+":
                result += num;
                break;
            case "-":
                result -= num;
                break;
            case "×":
                result *= num;
                break;
            case "÷":
                if (num == 0) {
                    display.setText("错误");
                    operator = "";
                    isNewInput = true;
                    return;
                }
                result /= num;
                break;
        }

        String resStr = result % 1 == 0 ? String.valueOf((long) result) : String.valueOf(result);
        display.setText(resStr);
        currentInput = resStr;
        operator = "";
        isNewInput = true;
    }

    private void clearAll() {
        currentInput = "0";
        result = 0;
        operator = "";
        isNewInput = true;
        display.setText(currentInput);
    }

    private void clearCurrent() {
        currentInput = "0";
        isNewInput = true;
        display.setText(currentInput);
    }

    private void backspace() {
        if (isNewInput) return;
        if (currentInput.length() > 1) {
            currentInput = currentInput.substring(0, currentInput.length() - 1);
        } else {
            currentInput = "0";
            isNewInput = true;
        }
        display.setText(currentInput);
    }

    private void toggleSign() {
        if (currentInput.startsWith("-")) {
            currentInput = currentInput.substring(1);
        } else {
            currentInput = "-" + currentInput;
        }
        display.setText(currentInput);
    }

    private void percentage() {
        double num = Double.parseDouble(currentInput) / 100;
        currentInput = String.valueOf(num);
        display.setText(currentInput);
    }

    private void reciprocal() {
        double num = Double.parseDouble(currentInput);
        if (num == 0) {
            display.setText("错误");
            isNewInput = true;
            return;
        }
        currentInput = String.valueOf(1 / num);
        display.setText(currentInput);
    }

    private void square() {
        double num = Double.parseDouble(currentInput);
        currentInput = String.valueOf(num * num);
        display.setText(currentInput);
    }

    private void squareRoot() {
        double num = Double.parseDouble(currentInput);
        if (num < 0) {
            display.setText("错误");
            isNewInput = true;
            return;
        }
        currentInput = String.valueOf(Math.sqrt(num));
        display.setText(currentInput);
    }

    private void memoryClear() {
        memory = 0;
    }

    private void memoryRecall() {
        currentInput = String.valueOf(memory);
        display.setText(currentInput);
        isNewInput = true;
    }

    private void memoryAdd() {
        memory += Double.parseDouble(currentInput);
    }

    private void memorySubtract() {
        memory -= Double.parseDouble(currentInput);
    }

    private void memoryStore() {
        memory = Double.parseDouble(currentInput);
    }

    private void memoryToggleSign() {
        memory = -memory;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingCalculator::new);
    }
}