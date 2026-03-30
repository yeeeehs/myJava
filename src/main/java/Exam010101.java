import java.util.Scanner;

public class Exam010101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;

        String str = s.nextLine();
        String lowerStr = str.toLowerCase();
        String cutStr = lowerStr.replaceAll(" ", "");

        System.out.println(cutStr);

        s.close();
    }
}
