public class Exam1 {
    // Exam01이라는 클래스 선언

    public static void main(String[] args) {
        // 프로그램이 시작되는 메인 메서드

        // i : 출력할 줄 번호(현재 몇 번째 줄인지)
        // 1부터 4까지 증가하며 총 4줄 출력
        for (int i=1; i<=4; i++) {

            // j : 현재 줄에서 출력할 공백 개수
            // i값에 따라 (4-i)번 반복,i가 증가할수록 공백 개수 감소(3,2,1,0)
            for (int j=1; j<=4-i; j++) {

                // 줄바꿈 없이 공백 출력
                System.out.print(" ");
            }

            // k : 현재 줄에서 출력할 별(*)의 개수
            // 별 개수는 (2*i-1)이며, 줄이 내려갈수록 1,3,5,7로 2개씩 증가
            for (int k=1; k<=(2*i-1); k++) {

                // 줄바꿈 없이 별 출력
                System.out.print("*");
            }

            // 한 줄(공백+별) 출력 후 다음줄로 이동
            System.out.println();
        }
    }
}