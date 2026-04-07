public class Hello {
    public static void main (String args[]) {
        System.out.println("��Һ�!");
        System.out.println("Nice to meet you");
        Student stu = new Student();
        stu.speak("We are students");
        System.out.println();
    }
}
class Student {
    public void speak(String s) {
        System.out.println(s);
    }
}