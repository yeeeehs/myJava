public class Exam3 {
    // Exam03이라는 클래스 선언

    public static void main(String[] args) {
        // 프로그램이 시작되는 메인 메서드

        // 합계를 저장할 변수 hap을 선언 후 0으로 초기화
        int hap = 0;

        // i를 100부터 300까지 1씩 증가하며 반복하는 for문
        for (int i = 100; i <= 300; i++) {

            //&&(AND연산자)를 사용한 조건문. i가 5의 배수이면서 동시에 7의 배수인지 확인
            if (i % 5 == 0 && i % 7 == 0) {

                //조건에 만족하는 값 i를 hap에 더해줌
                hap += i;
            }
        }
        //for문이 다 돌고 난 후, 누적된 총합인 hap을 출력
        System.out.println(hap);
    }
}