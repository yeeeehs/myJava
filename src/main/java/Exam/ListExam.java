package Exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        System.out.println("2세대 반복문");

        for(int num : a) {
            System.out.println(num);
        }

        System.out.println("3세대 반복문");

        a.forEach(num -> System.out.println(num));
    }
}