import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam04 {
    public static void main(String args[]) {
        List<Integer> num = new ArrayList<>(Arrays.asList(5,3,6,1,2,4));

        for (int i = 0; i < num.size() - 1; i++) {
            for (int j = 0; j < num.size() - 1 - i; j++) {
                if (num.get(j) > num.get(j + 1)) {
                    int temp = num.get(j);
                    num.set(j, num.get(j + 1));
                    num.set(j + 1, temp);
                }
            }
        }

        num.forEach(n -> System.out.print(n + " "));
    }
}