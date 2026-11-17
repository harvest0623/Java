package com.hh.interface3;

public class ClassDataInterImpl1 implements ClassDataInter
{
    private Student[] students;
    public ClassDataInterImpl1(Student[] students)
    {
        this.students = students;
    }
    @Override
    public void printAllStudentInfo()
    {
        for(Student s : students)
        {
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }
    }
    @Override
    public void printAverageScore()
    {
        double sum = 0;
        for(Student s : students)
        {
            sum += s.getScore();
        }
        System.out.println("平均分是:" + sum / students.length);
    }
}
