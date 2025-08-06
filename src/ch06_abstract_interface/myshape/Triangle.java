package ch06_abstract_interface.myshape;

public class Triangle extends Shape{
    private double width ; // 너비
    private double height ; // 높이

//    @Override
//    protected void draw() {
//        System.out.println("하하");
//    }

    public Triangle(String linecolor, String fillcolor, double width, double height){
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    // Implementation : 구체화(구현)
    @Override // 부모 클래스의 추상 메소드를 오버라이딩 했습니다.
    public double calcArea() { // 각 클래스는 각자의 맡은 역할을 여기에 구현하면 됩니다.
        return this.width * this.height / 2.0 ;
    }

    @Override
    public double calcPerimeter() {
        // 삼각형의 둘레 길이를 구하려면, 삼각 함수를 공부해야 합니다.
        return 20.0; // 편의상 20.0이라고 가정
    }

    @Override
    public void display() {
        super.area = this.calcArea() ;
        super.perimeter = this.calcPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }
}
