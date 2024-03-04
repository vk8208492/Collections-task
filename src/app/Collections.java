package app;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Sergei");
        list.add("Natalia");
        list.add("Vladyslav");
        list.add("Anastasia");
        list.add("Artem");

        System.out.println("1) User:" + list);
        list.add(2, "Larisa");
        System.out.println("2) User: " + list) ;

        System.out.println("3) User:");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("4) Element - " + list.get(3));
        int idx = 2;
        System.out.println("5) Element at index " + idx +
                " is " + list.get(idx));


    }
}
