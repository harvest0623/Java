package chapter7;

public class People {
    public int height;
    People(int m){
        height = m;
    }
    public boolean equals(Object o) {
        People p =(People)o;
        return height == p.height;
    }
}