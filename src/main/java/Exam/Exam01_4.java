package Exam;

public class Exam01_4 {
    public static void main(String[] args) {
        for(int i=1; i <= 7; i++){
            int cnt = 0;

            if (i <= 4) {
                cnt = i;
            } else {
                cnt = 8 - i;
            }
            for (int j = 0; j < cnt; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}