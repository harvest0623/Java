package com.hh.interface3;

public class ClassDataInterImpl2 implements ClassDataInter
{
    private Student[] students;
    public ClassDataInterImpl2(Student[] students)
    {
        this.students = students;
    }
    @Override
    public void printAllStudentInfo()
    {
        int maleCount = 0;
        for(Student s : students)
        {
            if (s.getSex() == '男')
                maleCount++;
        }
        System.out.println("男生数量是:" + maleCount);
        System.out.println("女生数量是:" + (students.length - maleCount));
    }
    @Override
    public void printAverageScore()
    {
        double sum = 0;
        double max = students[0].getScore();
        double min = students[0].getScore();
        for(Student s : students)
        {
            sum += s.getScore();
            if (s.getScore() > max)
            {
                max = s.getScore();
            }
            if (s.getScore() < min)
            {
                min = s.getScore();
            }
        }
        System.out.println("平均分是:" + sum / students.length);
        System.out.println("最高分是:" + max);
        System.out.println("最低分是:" + min);
    }
}
