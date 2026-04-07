package chapter5.example2;

public class Student extends People implements interfacePay{
    private String sno;
    private double weight;
    Student(String name,double weight,String sno) {
        super();
        this.setName(name);
        this.weight = weight;
        this.sno = sno;
    }
    public String getSno(){
        return sno;
    }
    public void setSno(String sno){
        this.sno = sno;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getStuWeight() {
        return weight;
    }
    @Override
    public void work(){
        System.out.println("连续学习两小时");
    }

    @Override
    public String  toString(){
        return this.getSchoolName()+"  "+this.getName()+" "+weight+ " "+sno;
    }

    public void pay(Student s,int month){
        System.out.println(this.getName()+"支付了"+month+"个月的费用,共计"+month*0.2);
    }

    @Override
    public void pay(int month) {
        System.out.println(this.getName()+"支付了"+month+"个月费用,共计"+month*0.2);
    }
}