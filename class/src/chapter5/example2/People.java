package chapter5.example2;

public abstract class People {
    private final String SCHOOLNAME = "东华理工大学";
    private String name;
    private int weight;

    public People() {

    }

    public People(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getSchoolName() {
        return SCHOOLNAME;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return SCHOOLNAME + "  " + name + " " + weight;
    }

    public abstract void work();
}