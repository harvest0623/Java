package chapter5.Lamba;

interface SpeakHello {
    void speak();
}

class Service {
    public void turnon(SpeakHello speaker) {
        speaker.speak();
    }
}

public class welcome {
    public static void main(String[] args) {
        Service service = new Service();
        service.turnon(() -> System.out.println("欢迎光临"));
    }
}
