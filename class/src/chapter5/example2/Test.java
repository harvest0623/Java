package chapter5.example2;

public class Test {
    public static void main(String[] args) {
        Student s=new Student("张三",110.5,"20230101");
        Service.peopleWork(s);
        Service.peoplePay(s,2);
        Teacher t=new Teacher("李四",110,"讲师");
        Service.peopleWork(t);
        Service.peoplePay(t,2);
    }
}