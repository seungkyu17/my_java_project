package ch04_class;

public class ShapeAreaMain {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 15;

        ShapeArea obj = new ShapeArea();

        //메소드 오버로딩
        obj.area(a); // 원
        obj.area(b, a); // 사각형
        obj.area(b, c, a); // 사다리꼴
    }
}