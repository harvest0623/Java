package chapter5.example2;

public class Teacher extends People implements interfacePay{
    private String profession;

    Teacher (String name,int weight,String profession) {
        super(name,weight);
        this.profession = profession;
    }
    @Override
    public void work(){
        System.out.println("连续备课两小时");
    }
    @Override
    public String  toString(){
        return this.getSchoolName()+ "  "+this.getName()+"  " + this.getWeight()
                +"  "+profession;
    }
    @Override
    public void pay(int month) {
        System.out.println(this.getName()+"支付了"+month+"个月费用"+(month*0.2));
    }
}