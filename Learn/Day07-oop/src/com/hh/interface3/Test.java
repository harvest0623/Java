package com.hh.interface3;

public class Test
{
    public static  void main(String[] args)
    {
        //目标:完成接口案例
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("小王",'男',90);
        allStudents[1] = new Student("小张",'女',80);
        allStudents[2] = new Student("小李",'男',70);
        allStudents[3] = new Student("小赵",'女',60);
        allStudents[4] = new Student("小孙",'男',50);
        allStudents[5] = new Student("小周",'女',40);
        allStudents[6] = new Student("小吴",'男',30);
        allStudents[7] = new Student("小郑",'女',20);
        allStudents[8] = new Student("小黄",'男',10);
        allStudents[9] = new Student("小陈",'女',92);
        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);
        cdi.printAllStudentInfo();
        cdi.printAverageScore();
    }
}
