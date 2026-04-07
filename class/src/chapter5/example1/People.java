package chapter5.example1;

public class People {
    private static String schoolName = "东华理工大学";
    private String name;
    private int weight;
    public People(String name, int weight ) {
        this.name = name;
        this.weight = weight;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setWeight(int weight) {
        this.weight=weight;
    }
    public int getWeight(){
        return weight;
    }
    public void work(){
        System.out.println("连续学习2小时");
    }

}