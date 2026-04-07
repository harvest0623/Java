package chapter7;

import java.time.LocalTime;

public class Example7_1 {
    public static void main(String[] args) {
        People<String> tom = new People<String>();
        tom.setFriend("Tom");
        String tomFriend = tom.getFriend();
        People<LocalTime> zhang = new People<LocalTime>();
        LocalTime zhangFriend = zhang.getFriend();
        System.out.println(zhangFriend);
        People<Double> geng = new People<Double>();
        geng.setFriend(1.618);
        double gengFriend = geng.getFriend();
        System.out.println(gengFriend);
        System.out.println(tomFriend);
    }
    static class People<T>{
        private T friend;
        public void setFriend(T friend){
            this.friend = friend;
        }
        public T getFriend() {
            return friend;
        }
    }
}
