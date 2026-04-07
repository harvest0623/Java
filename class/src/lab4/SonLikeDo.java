package lab4;

public class SonLikeDo implements DadLikeDo,MonLikeDo{
    @Override
    public void ride() {
        System.out.println("儿子喜欢骑车");
    }

    @Override
    public void basketball() {
        System.out.println("儿子喜欢打篮球");
    }

    @Override
    public void sing() {
        System.out.println("儿子喜欢唱歌");
    }

    @Override
    public void dance() {
        System.out.println("儿子喜欢跳舞");
    }

    public static void main(String[] args) {
        SonLikeDo son = new SonLikeDo();
        son.ride();
        son.basketball();
        son.sing();
        son.dance();
    }
}
