package chapter7;

import java.util.*;
public class Example7_3 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        for (int i = 0; i <= 60096; i++) {
            list.add("speed" + i);
        }
    }
}