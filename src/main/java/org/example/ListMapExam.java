package org.example;

import java.util.*;

public class ListMapExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Map<String, String>> List = new ArrayList<>();

        Map<String, String> map = null;

        for (int i = 0; i < 3; i++) {

            System.out.print("이름 : ");
            String name = scanner.next();

            System.out.print("이메일 : ");
            String email = scanner.next();

            System.out.print("부서 : ");
            String dept = scanner.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            List.add(map);

            map = null;
        }

        int listSize = List.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            Map<String, String> rMap = List.get(i);

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

            rMap = null;

        }

        System.out.println("2세대 반복문");

        for (Map<String, String> rMap : List) {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

        }

        System.out.println("3세대 반복문");

        List.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

        });

        System.out.println("4세대 반복문");

        List.parallelStream().forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

        });

        System.out.println("1.5세대 반복문");

        Iterator<Map<String, String>> it = List.iterator();

        while (it.hasNext()) {
            Map<String, String> rMap = it.next();

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

            rMap = null;

        }
    }
}