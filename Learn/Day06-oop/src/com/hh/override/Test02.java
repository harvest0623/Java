package com.hh.override;

public class Test02
{
    public static void main(String[] args)
    {
        //目标:方法重写的常见场景:子类重写Object的toString方法
        Student s = new Student("张三", '男', 18);
        System.out.println(s.toString()); //地址
        //直接输出对象会默认输出地址
    }
}

class Student
{
    private String name;
    private char sex;
    private int age;

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public Student()
    {

    }

    public Student(String name, char sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString()
//    {
//        return "Student{name=" + name + ",sex=" + sex + ",age=" + age + "}";
//    }
}