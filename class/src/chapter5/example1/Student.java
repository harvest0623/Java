package chapter5.example1;

public class Student extends People {
    private String sno;

    Student(String name,int weight,String sno) {
        super(name,weight);
        this.sno = sno;
    }
    public String getSno(){
        return sno;
    }
    public void setSno(String sno){
        this.sno = sno;
    }
    public String toString(){
        return this.getSchoolName()+"  "+this.getName()+"  "+this.getWeight()+" "+this.sno;
    }
}
