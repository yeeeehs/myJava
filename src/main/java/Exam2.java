public class Exam2 {
    // Exam02라는 클래스 선언

    public static void main(String[] args) {
        // 프로그램이 시작되는 메인 메서드

        // 웹 서버 로그 문자열 저장
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700]\"GET /apache_pb.gif HTTP/1.0\" 200";

        // 큰따옴표(")위치를 먼저 찾고, 그 위치 이후에서 첫 번째 공백을 찾아 GET 뒤 공백 위치를 구함.
        int space = log.indexOf(" ", log.indexOf("\""));

        // GET 뒤 공백 다음 글자부터 시작해서
        // 그 다음 공백 전까지 잘라내어 요청 URL(/apache_pb.gif)만 추출
        String res = log.substring(space + 1, log.indexOf(" ", space + 1));

        // 변수 res에 저장된 URL을 접속한 페이지 : /apache_pb.gif 형태로 추출
        System.out.println("접속한 페이지 : " + res);
    }
}