package ch01_variable_operator;

public class AreaTest {
    public static void main(String[] args) {
        double radius ; // 반지름
        double PI ; // 원주율

        radius = 10.0 ;
        PI = 3.14 ;

        double area ; // 면적
        area = PI * radius * radius ;

        System.out.print("반지름이 " + radius + "일 때 ") ;
        System.out.println("원의 면적은 " + area + "입니다.") ;
    }
}
