public class Exam3 { //Exam03이라는 클래스 선언

    public static void main(String[] args) { //프로그램의 시작점인 main메서드

        int hap = 0; //합계를 저장할 변수 hap을 선언 후 0으로 초기화

        for (int i = 100; i <= 300; i++) { //i는 100부터 300까지 1씩 증가하며 반복하는 for문
            if (i % 5 == 0 && i % 7 == 0) { //5의 배수, 7의 배수 둘 다 만족하는지
                hap += i; //조건에 맞는 숫자 i를 hap에 더해줌
            }
        }
        System.out.println(hap); //지금까지 더한 총합인 hap 출력
    }
}