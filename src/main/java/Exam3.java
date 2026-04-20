public class Exam3 {

    public static void main(String[] args) {

        int hap = 0;

        for (int i = 100; i <= 300; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                hap += i;
            }
        }
        System.out.println(hap);
    }
}