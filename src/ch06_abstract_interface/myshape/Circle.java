package ch06_abstract_interface.myshape;

public class Circle extends Shape{
    private double radius ; // 반지름
    private double xpos ; // x 좌표
    private double ypos ; // y 좌표

    public Circle(String fillcolor, String linecolor, double radius, double xpos, double ypos) {
        super(fillcolor, linecolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calcArea() { // 원의 면적
        return 3.14 * this.radius * this.radius ;
    }

    @Override // 둘레 = 2.0 * 파이 * 반지름
    public double calcPerimeter() {
        return 2.0 * 3.14 * this.radius;
    }

    @Override
    public void display() {
        super.area = this.calcArea() ;
        super.perimeter = this.calcPerimeter();

        System.out.println("원 정보");

        String message = "면적 : " + super.area;
        System.out.println(message);

        System.out.println("둘레 : " + super.perimeter);

        message = "원 중심 : (" + this.xpos + ", " + this.ypos + ")";
        System.out.println(message);
    }
}
