package chapter5.example2;

public class Service {
    public static void peopleWork(People p) {
        System.out.println(p);
        p.work();
    }
    public static void peoplePay(interfacePay p,int month) {
        p.pay(month);
    }
}