import java.util.Scanner;

public class Exam0101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String cutStr = str.toLowerCase().replaceAll(" ", "");

        System.out.println(cutStr);

        s.close();
    }
}
