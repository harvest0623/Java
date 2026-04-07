package chapter5.example1;

public class Teacher extends People{
    private String profession;

    Teacher (String name,int weight,String profession) {
        super(name, weight);
        this.profession = profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
    public String toString(){
        return this.getSchoolName()+"  "+this.getName()+"  "+this.getWeight()+" "+this.profession;
    }
}