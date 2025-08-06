package ch06_abstract_interface.myshape;

public class Rectangle extends Shape {
    private double width ; // 너비
    private double height ; // 높이

    public Rectangle(String linecolor, String fillcolor, double width, double height){
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return this.width*this.height ;
    }

    @Override // 둘레 = 2.0 * (밑변 + 높이)
    public double calcPerimeter() {
        return 2.0*(this.width+this.height) ;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();

        System.out.println("사각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }


}
