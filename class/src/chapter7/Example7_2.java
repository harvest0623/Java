package chapter7;

import java.util.*;

public class Example7_2 {
    public static void main(String[] args) {
        List<People> list = new LinkedList<People>();
        People tom = new People(178);
        list.add(tom);
        list.add(new People(78));
        list.add(new People(168));
        list.add(new People(188));
        System.out.println(list.indexOf(tom));
        list.remove(tom);
        People item = list.get(2);
        System.out.println(item.height);
        System.out.println(list.indexOf(tom));
        System.out.println(list.contains(new People(178)));
    }
}