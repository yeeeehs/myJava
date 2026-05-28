package Exam;

public class Exam2 {
    // Exam02라는 클래스 선언

    public static void main(String[] args) {
        // 프로그램이 시작되는 메인 메서드

        // 웹 서버 로그 문자열 저장
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700]\"GET /apache_pb.gif HTTP/1.0\" 200";

        //큰따옴표(") 위치를 찾은 후, 그 위치 이후에서 첫번째 공백을 찾음
        //+1을 통해 공백 다음 문자로 이동(url시작 위치)
        int start = log.indexOf(" ", log.indexOf("\""))+1;

        //start 위치 이후에서 첫 번째 공백을 찾아 요청 url의 끝 위치를 구한다
        int end = log.indexOf(" ", start);

        //start부터 end 직전까지 잘라서 요청 url만 추출
        String url = log.substring(start,end);

        // 변수 url에 저장된 값을 출력
        System.out.println(url);
    }
}