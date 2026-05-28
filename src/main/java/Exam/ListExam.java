package Exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<Integer> i = new ArrayList<>();

        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);

        System.out.println("2세대 반복문");

        for(int num : i) {
            System.out.println(num);
        }

        System.out.println("3세대 반복문");

        i.forEach(num -> System.out.println(num));
    }
}