package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        //int x ; 지역변수는 기본값이 없으므로 반드시 초기화 필요.
        //System.out.println(x);

        // 단계 2 : 객체 생성
        // 클래스이름 객체이름 = new 생성자이름() ;
        Saram01 yusin = new Saram01();

        Saram01 soon;
        soon = new Saram01();
        // 단계 3 : 객체의 멤버 변수에 쓰기 작업
        // 점(.)을 멤버 참조 연산자라고 부릅니다.
        yusin.nationality = "대한 민국";
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 75.4;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        // 단계 4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood);

        soon.nationality = "대한 민국";
        soon.name = "유관순";
        soon.height = 168.5;
        soon.weight = 50.0;
        soon.hobby = "축구";
        soon.blood = "O";

        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("취미 : " + soon.hobby);
        System.out.println("혈액형 : " + soon.blood);

        String message = yusin.showGenderInfo(1);
        System.out.println(message);

        message = soon.showGenderInfo(2);
        System.out.println(message);

        message = yusin.showBmiInfo();
        System.out.println(message);

        message = soon.showBmiInfo();
        System.out.println(message);

        yusin.display();
        soon.display();
    }
}
