package ch01_variable_operator;

public class PrintMe {
    public static void main(String[] args) {
        String name ;
        int age ;
        double height;
        double weight ;
        String blood ;
        char munja = 'd';
        boolean bool ;

        name = "홍길동";
        age = 30 ;
        height = 175.2 ;
        weight = 62.4 ;
        blood = "AB" ;
//        munja = 'd' ;
        bool = false;

        String message = "이름 : " + name ;
        System.out.println(message);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
        System.out.println("문자 : " + munja);
        System.out.println("진위 : " + bool);
    }
}
