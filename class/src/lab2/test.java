package lab2;

public class test {
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 8, 9};
        int remain = 11;
        int lcm = calculateLCM(num);
        int sumNumerators = 0;
        for (int n : num) {
            sumNumerators += lcm / n;
        }
        int totalCows = remain * lcm / (lcm - sumNumerators);
        System.out.println("总牛数: " + totalCows + "头");
        System.out.println("分配详情:");
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            int sonNumber = i + 1;
            int share = totalCows / num[i];
            sum += share;
            System.out.printf("第%d个儿子分得: %d头 (1/%d)%n",
                    sonNumber, share, num[i]);
        }
        System.out.println("分走的总数: " + sum + "头");
        System.out.println("剩余牛数: " + (totalCows - sum) + "头");
    }
    private static int calculateLCM(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = calculateLCM(lcm, numbers[i]);
        }
        return lcm;
    }
    private static int calculateLCM(int a, int b) {
        return a * b / calculateGCD(a, b);
    }
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}