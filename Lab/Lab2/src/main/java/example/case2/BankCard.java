package example.case2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 银行卡类 - 使用 @Component 注解注册为 Bean
 */
@Component("bankCard")
public class BankCard {

    @Value("6222021234567890123")   // 通过 @Value 注入银行卡号
    private String cardNo;

    @Value("50000.00")              // 通过 @Value 注入余额
    private double balance;

    @Value("工商银行")               // 通过 @Value 注入银行名称
    private String bankName;

    // Getter & Setter
    public String getCardNo() { return cardNo; }
    public void setCardNo(String cardNo) { this.cardNo = cardNo; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }

    @Override
    public String toString() {
        return "BankCard{cardNo='" + cardNo + "', bankName='" + bankName + "', balance=" + balance + "}";
    }
}