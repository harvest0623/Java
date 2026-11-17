package example.case2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 支付服务类 - 使用 @Service 注解
 * 通过 @Autowired 自动注入 User2 和 BankCard
 */
@Service("paymentService")
public class PaymentService {

    @Autowired  // ★ 注解注入：自动注入 User2
    private User2 user;

    @Autowired  // ★ 注解注入：自动注入 BankCard
    private BankCard bankCard;

    /**
     * 执行支付操作
     * @param amount 支付金额
     */
    public void pay(double amount) {
        System.out.println("====== 案例2：支付功能（注解注入） ======");
        System.out.println("操作用户: " + user.getName() + " (" + user.getLevel() + ")");
        System.out.println("支付金额: ¥" + amount);
        System.out.println("使用银行卡支付：");
        System.out.println("  银行: " + bankCard.getBankName());
        System.out.println("  卡号: " + bankCard.getCardNo());
        System.out.println("  原余额: ¥" + bankCard.getBalance());

        // 模拟扣款
        if (bankCard.getBalance() >= amount) {
            double newBalance = bankCard.getBalance() - amount;
            bankCard.setBalance(newBalance);
            System.out.println("  扣款成功！剩余余额: ¥" + newBalance);
        } else {
            System.out.println("  扣款失败！余额不足！");
        }
        System.out.println("====== 支付完成 ======\n");
    }
}