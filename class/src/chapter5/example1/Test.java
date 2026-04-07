package chapter5.example1;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("zhangsan",90,"20230101");
        System.out.println(student);
        student.work();
        Teacher teacher=new Teacher("lisi",110,"讲师");
        System.out.println(teacher);
        teacher.work();
    }
}