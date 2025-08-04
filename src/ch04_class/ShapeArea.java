package ch04_class;

public class ShapeArea {
    public void area(int top, int bottom, int width) {
        // 사다리꼴의 면적 구하기
        double area = (double) (top + bottom) * width / 2.0;
        System.out.println("사다리꼴의 면적 : " + area);
    }
    public void area(int width, int height){
        // 사각형의 면적 구하기
        int area = (width * height);
        System.out.println("사각형의 면적 : " + area);
    }
    public void area(int radius){
        // 원의 면적 구하기
        final double PI = 3.14; //읽기 전용이어야 하므로 final 키워드를 사용했다.
        double area = PI * (radius * radius);
        System.out.println("원의 면적 : " + area);
    }
}