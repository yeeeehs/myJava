public class Exam01_4 {
    public static void main(String[] args) {

        int n = 4;

        for(int i=1; i<=2*n-1; i++){

            int star;

            if(i<=n) {
                star = i;
            } else {
                star = 2 * n - i;
            }
            for(int j=1; j<=star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
